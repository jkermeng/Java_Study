package tcpnet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class SingleTcpServer {
	public static int count = 0;
	public static List<String> hostList = new ArrayList<>();

	public static void main(String[] args) {
		ServerSocket ss;
		try {
			ss = new ServerSocket(10085);
			while (true) {
				try {
					Socket socket = ss.accept();
					String host = socket.getInetAddress().getHostAddress();
					addHost(hostList, host);
					getCount(hostList, host);
					System.out.println(socket.getInetAddress().getHostAddress() + "����");
					new Thread(new ReaderThread(socket)).start();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

	/**
	 * �������ip
	 * 
	 * @param hostList
	 * @param host
	 */
	private synchronized static void addHost(List<String> hostList, String host) {
		if (hostList.size() != 0) {
			for (int i = 0; i < hostList.size(); i++) {
				if (hostList.get(i).equals(host)) {
					break;
				} else {
					hostList.add(host);
				}
			}
		} else {
			hostList.add(host);
		}
	}

	/**
	 * ͳ����������
	 * 
	 * @param hostList
	 * @param host
	 * @return
	 */
	private synchronized static int getCount(List<String> hostList, String host) {
		if (hostList.size() != 0) {
			boolean contains = hostList.contains(host);
			for (int i = 0; i < hostList.size(); i++) {
				if (hostList.get(i).equals(host)) {
					count++;
					return count;
				}
			}
		}
		return count;
	}

}

/**
 * ��ȡ�ͻ�������
 * 
 * @author Administrator
 *
 */
class ReaderThread extends Thread {
	private Socket socket;

	public ReaderThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		while (true) {
			try {
				if (!socket.isClosed()) {
					String hostAddress = socket.getInetAddress().getHostAddress();
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
					BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					String line = null;
					while ((line = br.readLine()) != null) {
						System.out.println("��������ʾ��" + hostAddress + "��˵��" + line.trim());
						StringBuffer ip = new StringBuffer();
						for (String ipdress : SingleTcpServer.hostList) {
							ip.append("��" + ipdress + "��" + "��");
						}
						line = line.replaceAll("��", "��");
						line = line.replaceAll("��", "��");
						line = line.replaceAll("ô", "��");
						line = line.replaceAll("��", "");

						bw.write(line + "��" + "\n��ǰ��������: " + SingleTcpServer.count + "\n����ip��" + ip);
						bw.newLine();
						bw.flush();
						if (line.trim().equals("886")) {
							removeHost(SingleTcpServer.hostList, socket.getInetAddress().getHostAddress());
							System.out.println(hostAddress + "������");
							socket.close();
							break;
						}
					}
				} else {
					break;
				}
			} catch (IOException e) {
				// e.printStackTrace();
				try {
					removeHost(SingleTcpServer.hostList, socket.getInetAddress().getHostAddress());
					socket.close();
					System.out.println(socket.getInetAddress().getHostAddress() + "����");
					break;
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

	private synchronized void removeHost(List<String> hostList, String host) {
		if (hostList.size() != 0) {
			for (int i = 0; i < hostList.size(); i++) {
				if (hostList.get(i).equals(host)) {
					hostList.remove(i);
					SingleTcpServer.count--;
					break;
				}
			}
		}
	}

}
