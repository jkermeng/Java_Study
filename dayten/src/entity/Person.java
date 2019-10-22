package entity;

abstract class Person {
	private String name;

	public Person() {
		System.out.println("继承类的构造方法");
	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println("普通方法");
	}

	public abstract void show1();

	public abstract void show2();

	// abstract void show1();

}
