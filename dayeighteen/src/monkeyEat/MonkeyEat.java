package monkeyEat;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.plaf.SliderUI;

public class MonkeyEat {
	public static void main(String[] args) {
		Eat eat = new Eat();
		Thread m1 = new Thread(eat, "猴子1");
		Thread m2 = new Thread(eat, "猴子2");
		Thread m3 = new Thread(eat, "猴子3");
		m1.start();
		m2.start();
		m3.start();

		// showAB AB = new showAB();
		// showAB B = new showAB();
		// Thread A = new Thread(AB, "A线程");
		// Thread B = new Thread(AB, "B线程");

		// A.setName("A线程");
		// B.setName("B线程");

		// Thread A = new Thread(showAB, "A线程");
		// Thread B = new Thread(showAB, "B线程");
		// A.start();
		// B.start();
	}
}

class showAB implements Runnable {

	@Override
	public void run() {
		while (true) {

			try {

				if (Thread.currentThread().getName().equals("A线程")) {
					Thread.currentThread().sleep(1000 * 5);

					System.out.println(Thread.currentThread().getName() + "AAA" + new Date());

				} else if (Thread.currentThread().getName().equals("B线程")) {
					Thread.currentThread().sleep(1000);

					System.out.println(Thread.currentThread().getName() + "B" + new Date());
				}

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class Eat implements Runnable {
	private static double peach = 100;
	private static double num = 0;
	private Lock lock = new ReentrantLock();

	@Override
	public void run() {
		while (true) {

			if (peach > 0) {
				lock.lock();
					num = peach;
					peach = Math.ceil(peach / 2);

					num -= peach;
					peach = num;
					System.out.println(Thread.currentThread().getName() + "拿到" + peach + "桃子");
				lock.unlock();
			} else {
				System.out.println("没有桃子了！！！！");
				break;

			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}