package tcpnet;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		while (true) {
			ServerSocket serverSocket = new ServerSocket(10085);
			Socket socket = serverSocket.accept();
			WriteToClient rc = new WriteToClient(socket);
			Thread thread = new Thread(rc);
			thread.start();
		}

	}
}

class WriteToClient implements Runnable {
	private Socket socket;

	public WriteToClient(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		while (true) {
			String hostName = socket.getInetAddress().getHostName();
			System.out.println(hostName);
		}
	}

}