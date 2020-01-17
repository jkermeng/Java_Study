package simpleproduct;

import java.util.List;

public class CreateApple implements Runnable {
	private List<Apple> apple;

	public CreateApple(List<Apple> apple) {
		super();
		this.apple = apple;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (apple) {
				if (apple.size() == 0) {
					apple.add(new Apple(1, "��ƻ��", true));
					apple.add(new Apple(2, "��ƻ��", true));
					apple.add(new Apple(3, "��ƻ��", true));
					apple.add(new Apple(4, "��ƻ��", true));
					apple.notify();

				} else {
					try {
						apple.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				// if (apple.size() > 0) {
				//
				// for (Apple apple2 : apple) {
				//
				// if (!apple2.isFlag()) {
				// synchronized (apple) {
				// apple.add(new Apple(1, "��ƻ��", true));
				// apple.add(new Apple(2, "��ƻ��", true));
				// apple.add(new Apple(3, "��ƻ��", true));
				// apple.add(new Apple(4, "��ƻ��", true));
				// apple.notify();
				// }
				// }
				//
				// }
				// }

			}
		}
	}
}