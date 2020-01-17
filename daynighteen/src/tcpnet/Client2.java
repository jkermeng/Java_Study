package tcpnet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("localhost", 10085);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					String line = null;
					try {
						System.out.println("我要说的话：");
						while ((line = br.readLine()) != null) {
							bw.write(line.trim());
							bw.newLine();
							bw.flush();
							break;
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {

					try {
						BufferedReader tbr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
						String line = null;
						while ((line = tbr.readLine()) != null) {
							System.out.println("服务器说：" + socket.getLocalAddress().getHostName() + "说了\t" + line);
							break;
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();

	}
}
