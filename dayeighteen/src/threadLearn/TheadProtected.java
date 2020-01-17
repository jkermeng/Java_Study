package threadLearn;

public class TheadProtected {
	public static void main(String[] args) {
		TT_ t_ = new TT_();
		t_.setName("sonThread");
		 t_.setDaemon(true);
		t_.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("main运行中!!");
			TTC.SleepMothed(700);
		}
		System.out.println("main关闭");

	}
}

class TTP extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(getName() + ": " + i);
			TTC.SleepMothed(700);

		}
		System.out.println(getName() + "結束");

	}

}

class TT_ extends Thread {

	@Override
	public void run() {
		TTP ttp1 = new TTP();
		// TTP ttp2 = new TTP();
		ttp1.setDaemon(true);
		ttp1.setName("Protected");
		ttp1.start();
		for (int i = 0; i < 20; i++) {
			System.out.println(getName() + ": " + i);
			TTC.SleepMothed(700);

		}
		System.out.println(getName() + "結束");

	}

}

class TTC extends Thread {
	public static void SleepMothed(int num) {
		try {
			sleep(num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}