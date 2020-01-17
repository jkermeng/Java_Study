package dataPackge;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class GetDataPackage {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(10085);
		String word = null;
		while (true) {
			byte set[] = new byte[1024 * 1024];
			DatagramPacket dp = new DatagramPacket(set, set.length, InetAddress.getLocalHost(), 10085);
			ds.receive(dp);
			byte[] data = dp.getData();
			word = new String(data, 0, data.length);
			System.out.println(word);

			if (word.equals("886")) {
				break;
			}
		}
		ds.close();
	}
}
