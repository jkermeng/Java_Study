package dayTest;

import java.util.Random;

public class OneTest {
	public static void main(String[] args) {
		int[] arr = { 10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300 };
		getMoney gm = new getMoney(arr);
		Thread t1 = new Thread(gm, "抽奖箱1");
		Thread t2 = new Thread(gm, "抽奖箱2");
		t1.start();
		t2.start();

	}
}

class getMoney implements Runnable {
	private static int[] arr;

	public getMoney(int[] arr) {
		super();
		this.arr = arr;
	}

	@Override
	public void run() {
		while (true) {

			for (Integer i : arr) {
				synchronized (arr) {
					System.out.println(Thread.currentThread().getName() + "又产生了一个" + i + "元大奖");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();

					}
				}
			}
		}
	}

}