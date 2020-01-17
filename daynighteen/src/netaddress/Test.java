package netaddress;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {

	public static void main(String[] args) throws IOException {
		InetAddress localHost = InetAddress.getLocalHost();
		System.out.println(localHost.getHostAddress());
		System.out.println(localHost.getHostName());
		System.out.println(localHost.getLocalHost());
		System.out.println("---------------------------");
		InetAddress byName = InetAddress.getByName("172.168.1.173");
		boolean reachable = byName.isReachable(1);
		System.out.println(reachable);
		System.out.println(byName.getHostName());
		System.out.println("---------------------------");
		Integer a = 0;
		while (a < 255) {
			InetAddress byName2 = InetAddress.getByName("172.168.1." + a.toString());
			boolean reachable2 = byName2.isReachable(100);
			if (reachable2) {
				System.out.println(a);
			}
			a++;

		}
	}

}
