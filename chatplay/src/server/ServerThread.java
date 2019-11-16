package server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ServerThread extends Thread {
	private Socket socket;

	public ServerThread(Socket socket) {
		super();
		this.socket = socket;
	}

	public ServerThread() {
		super();
	}

	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(".\\chat.txt", true)));
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String inStr = "";
			String OStr = "";
			while (true) {
				inStr = socket.getInetAddress().getLocalHost() + ":" + br.readLine();
				OStr = inStr;
				bw.write(inStr);
				bw.newLine();
				bw.flush();
				for (Socket sk : Server.list) {
					if (sk != null) {
						BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(sk.getOutputStream()));
						bfw.write(OStr);
						System.out.println(OStr);
						bfw.newLine();
						bfw.flush();
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		while (true) {

		}
	}

}
