package server;

import java.awt.List;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;

public class Server {
	public static ArrayList<Socket> list = new ArrayList<Socket>();

	public static void main(String[] args) throws IOException {
		ServerSocket server = null;
		try {
			server = new ServerSocket(1254);
			server.setSoTimeout(1000 * 10);
			while (true) {
				Socket socket = server.accept();
				System.out.println("连接的客户端IP：" + server.getInetAddress());
				list.add(socket);
				ServerThread st = new ServerThread(socket);
				st.start();

			}
		} catch (SocketTimeoutException e) {
			e.printStackTrace();
			System.exit(0);

		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
