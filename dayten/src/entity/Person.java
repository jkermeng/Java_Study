package entity;

abstract class Person {
	private String name;

	public Person() {
		System.out.println("�̳���Ĺ��췽��");
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
		System.out.println("��ͨ����");
	}

	public abstract void show1();

	public abstract void show2();

	// abstract void show1();

}
