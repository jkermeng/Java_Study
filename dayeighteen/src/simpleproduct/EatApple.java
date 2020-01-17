package simpleproduct;

import java.util.Iterator;
import java.util.List;

public class EatApple implements Runnable {
	private List<Apple> apple;
	private static Integer n;

	public EatApple(List<Apple> apple) {
		super();
		this.apple = apple;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (apple) {
				if (apple.size() > 0) {

					apple.notify();
					Iterator<Apple> iterator = apple.iterator();
					while (iterator.hasNext()) {
						Apple next = iterator.next();
						if (next.isFlag()) {
							System.out.println("吃一个" + next.getKind() + "");
							next.setFlag(false);
							iterator.remove();
						}
					}

					apple.notify();

				} else {
					System.out.println("给我造苹果！！！！");
					try {

						apple.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		}

	}
}
