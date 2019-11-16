package client;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientThread extends Thread {
	private Socket socket;

	public ClientThread(Socket socket) {
		super();
		this.socket = socket;
	}

	public ClientThread() {
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
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				bw.write(sc.next().trim());
				bw.newLine();
				bw.flush();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
	}

}
