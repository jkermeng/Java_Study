package dataPackge;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDataPackage {
	public static void main(String[] args) throws IOException {
		X x = new X();
		Thread t1 = new Thread(x);
		Thread t2 = new Thread(x);
		Thread t3 = new Thread(x);
		Thread t4 = new Thread(x);
		Thread t5 = new Thread(x);

		t1.start();
		// t2.start();
		// t3.start();
		// t4.start();
		// t5.start();

	}

}

class X implements Runnable {

	@SuppressWarnings("resource")
	@Override
	public void run() {
		try {
			DatagramSocket ds = new DatagramSocket();
			while (true) {

				// BufferedReader br = new BufferedReader(new
				// InputStreamReader("99999"));
				FileInputStream fs = new FileInputStream("D:\\ideaIU-193.4099.13.exe");
				byte fbt[] = new byte[1024];
				fs.read(fbt);
				String len = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
				byte set[] = len.getBytes();
				DatagramPacket dp = new DatagramPacket(fbt, fbt.length, InetAddress.getByName("172.168.1.173"), 10085);
				ds.send(dp);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}