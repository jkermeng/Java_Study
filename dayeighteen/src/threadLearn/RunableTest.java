package threadLearn;

public class RunableTest {
	public static void main(String[] args) {
		 Runabletick rtk = new Runabletick();
		 Thread t1 = new Thread(rtk, "窗口1");
		 Thread t2 = new Thread(rtk, "窗口2");
		// Thread t3 = new Thread(rtk, "窗口3");
		// Thread t4 = new Thread(rtk, "窗口4");
		 t1.start();
		 t2.start();
		// t3.start();
		// t4.start();
		T_T tt1 = new T_T();
		 T_T tt2 = new T_T();
		// T_T tt3 = new T_T();
//		 tt1.setName("窗口1");
//		 tt2.setName("窗口2");
//		 tt3.setName("窗口3");
//		 tt1.start();
//		 tt2.start();
//		 tt3.start();

	}
}

class T_T extends Thread {
	public static int num = 10;

	@Override
	public void run() {
		while (true) {
			/*
			 * synchronized (this) { if (num > 0) {
			 * System.out.println(Thread.currentThread().getName() + "销售一张票" +
			 * "第" + num); num--; // SleepMethod.sleep(2); //
			 * System.out.println("剩下：" + num-- + "张"); }
			 * 
			 * else { System.out.println(Thread.currentThread().getName() +
			 * "售罄！！！！！"); break; } }
			 */
			int getnum = getnum();
			if (getnum == 0) {
				System.out.println(Thread.currentThread().getName() + "售罄！！！！！");
				break;
			} else {
				System.out.println(Thread.currentThread().getName() + "销售一张票" + "第" + getnum);
			}
		}
	}

	private synchronized int getnum() {
		if (num >= 0) {
			// System.out.println(Thread.currentThread().getName() + "销售一张票" +
			// "第" + num);
			return num--;
		} else {
			return 0;
		}
	}

}

class Runabletick implements Runnable {
	public static int num = 10;

	@Override
	public void run() {
		while (true) {
			// synchronized (this) {
			// if (num > 0) {
			// System.out.println(Thread.currentThread().getName() + "销售一张票" +
			// "第" + num);
			// num--;
			// // SleepMethod.sleep(500);
			// // System.out.println("剩下：" + num-- + "张");
			// } else {
			// System.out.println(Thread.currentThread().getName() + "售罄！！！！！");
			// break;
			// }
			int getnum = getnum();
			if (getnum == 0) {
				System.out.println(Thread.currentThread().getName() + "售罄！！！！！");
				break;
			} else {
				System.out.println(Thread.currentThread().getName() + "销售一张票" + "第" + getnum);
			}
		}
	}

	// }

	private synchronized int getnum() {
		if (num >= 0) {
			// System.out.println(Thread.currentThread().getName() + "销售一张票" +
			// "第" + num);
			return num--;
		} else {
			return 0;
		}
	}
}