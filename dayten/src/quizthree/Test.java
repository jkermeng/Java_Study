package quizthree;

public class Test {
	public static void main(String[] args) {
		Master master = new Master("С��");
		Dog dog = new Dog("����");
		Cat cat = new Cat("С����");
		Food food = new Fish("��");
		master.feed(cat, food);
		System.out.println("~~~~~~~~~~~~~~~~~");
		master.feed(dog, food);
	}

}
