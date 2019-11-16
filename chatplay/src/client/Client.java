package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 1254);
			ClientThread ct = new ClientThread(socket);
			ct.start();
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String Instr = "";
			while (true) {
				Instr = br.readLine();
				System.out.println(Instr);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
