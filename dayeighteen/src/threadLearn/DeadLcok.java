package threadLearn;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLcok {
	public static void main(String[] args) {
		Death d = new Death(true);
		Death d2 = new Death(true);

		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d2);
		t1.start();
		t2.start();
	}
}

class Death implements Runnable {
	public boolean flag;

	public Death(boolean flag) {
		super();
		this.flag = flag;
	}

	@Override
	public void run() {
		while (true) {
			if (flag) {
				synchronized (AB.objA) {
					System.out.println("this is objA");
					synchronized (AB.objB) {
						System.out.println("this is objA / objB");

					}
				}
			} else {
				synchronized (AB.objB) {
					System.out.println("this is objB");
					synchronized (AB.objA) {
						System.out.println("this is objB / objA");

					}
				}
			}
		}
	}
}

class AB {
	public static Object objA = new Object();
	public static Object objB = new Object();

}
