package threadLearn;

public class RunableTest {
	public static void main(String[] args) {
		 Runabletick rtk = new Runabletick();
		 Thread t1 = new Thread(rtk, "����1");
		 Thread t2 = new Thread(rtk, "����2");
		// Thread t3 = new Thread(rtk, "����3");
		// Thread t4 = new Thread(rtk, "����4");
		 t1.start();
		 t2.start();
		// t3.start();
		// t4.start();
		T_T tt1 = new T_T();
		 T_T tt2 = new T_T();
		// T_T tt3 = new T_T();
//		 tt1.setName("����1");
//		 tt2.setName("����2");
//		 tt3.setName("����3");
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
			 * System.out.println(Thread.currentThread().getName() + "����һ��Ʊ" +
			 * "��" + num); num--; // SleepMethod.sleep(2); //
			 * System.out.println("ʣ�£�" + num-- + "��"); }
			 * 
			 * else { System.out.println(Thread.currentThread().getName() +
			 * "��������������"); break; } }
			 */
			int getnum = getnum();
			if (getnum == 0) {
				System.out.println(Thread.currentThread().getName() + "��������������");
				break;
			} else {
				System.out.println(Thread.currentThread().getName() + "����һ��Ʊ" + "��" + getnum);
			}
		}
	}

	private synchronized int getnum() {
		if (num >= 0) {
			// System.out.println(Thread.currentThread().getName() + "����һ��Ʊ" +
			// "��" + num);
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
			// System.out.println(Thread.currentThread().getName() + "����һ��Ʊ" +
			// "��" + num);
			// num--;
			// // SleepMethod.sleep(500);
			// // System.out.println("ʣ�£�" + num-- + "��");
			// } else {
			// System.out.println(Thread.currentThread().getName() + "��������������");
			// break;
			// }
			int getnum = getnum();
			if (getnum == 0) {
				System.out.println(Thread.currentThread().getName() + "��������������");
				break;
			} else {
				System.out.println(Thread.currentThread().getName() + "����һ��Ʊ" + "��" + getnum);
			}
		}
	}

	// }

	private synchronized int getnum() {
		if (num >= 0) {
			// System.out.println(Thread.currentThread().getName() + "����һ��Ʊ" +
			// "��" + num);
			return num--;
		} else {
			return 0;
		}
	}
}