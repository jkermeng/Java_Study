package dayTest;

public class TwoTest {
	public static void main(String[] args) {
		number nb = new number(1);
		Thread t1 = new Thread(nb, "线程one");
		Thread t2 = new Thread(nb, "线程two");
		t1.start();
		t2.start();

	}
}

class number implements Runnable {
	private static Integer num;
	private number nb;

	public number(Integer num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "number [num=" + num + "]";
	}

	@Override
	public void run() {
		while (true) {
			synchronized (num) {

				if (num == 1) {
					System.out.println(Thread.currentThread().getName() + "输出：" + num);
					num--;
				} else {
					System.out.println(Thread.currentThread().getName() + "输出：" + num);
					num++;
				}
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
