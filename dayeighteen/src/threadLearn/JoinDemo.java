package threadLearn;

import java.util.Date;

public class JoinDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadJoin join1 = new ThreadJoin();
		ThreadJoin join2 = new ThreadJoin();
		ThreadJoin join3 = new ThreadJoin();
		join1.setName("²ά²Ω");
		join2.setName("²άΨ§");
		join3.setName("²άξ£");
		join1.start();
		try {
			join1.join(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		join2.start();
	
		join3.start();
	}
}

class ThreadJoin extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println(getName()+"\t"+new Date() + ":" + i);
			try {
				Thread.sleep(1000 * 1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
