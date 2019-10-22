package entity;

public abstract class Animal {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String name) {
		this.name = name;
	}

	public abstract void bark();


}
