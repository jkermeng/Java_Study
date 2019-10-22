package entity;

public class Teacher extends Person {

	public Teacher() {
		super();
		// 先执行父类构造
		System.out.println("子类的构造方法");
	}

	// 抽象方法
	@Override
	public void show1() {
		// TODO Auto-generated method stub

	}

	// 抽象方法
	@Override
	public void show2() {
		// TODO Auto-generated method stub

	}

	// 抽象类中的普通方法
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
	}

}
