package threadLearn;

import javax.swing.plaf.SliderUI;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		// System.out.println("1");
		// Thread.sleep(1000);
		// System.out.println("2");
		// Thread.sleep(1000);
		// System.out.println("3");
		// Thread.sleep(1000);
		// System.out.println("4");
		// TT tt = new TT();
		// tt.setName("老一");
		// TT tt2 = new TT();
		// tt2.setName("老二");
		// tt.start();
		// tt2.start();
		// Thread.sleep(1000);
		// System.out.println("程序下一次");
		TT tt = new TT();
		TT tt2 = new TT();
		TT tt3 = new TT();
		tt.setName("窗口1");
		tt2.setName("窗口2");
		tt3.setName("窗口3");
		tt.start();
		tt2.start();
		tt3.start();

	}
}

class TT extends Thread {
	public static int num = 10;

	@Override
	public void run() {
		String name2 = Thread.currentThread().getName();
		while (true) {
			// String name2 = Thread.currentThread().getName();
			// System.out.println(name2 + "开启子线程！！");
			// SleepMethod.sleep(1000);
			if (num <= 0) {
				System.out.println("已经售罄！！！");
				break;
			} else {
				System.out.println(name2 + "出售一张..");
				System.out.println("剩余" + num-- + "张");
				SleepMethod.sleep(1000);
			}
		}

	}

}

class SleepMethod extends Thread {
	public static void sleep(int num) {
		try {
			Thread.sleep(num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}