package quizthree;

public class Test {
	public static void main(String[] args) {
		Master master = new Master("小明");
		Dog dog = new Dog("旺财");
		Cat cat = new Cat("小喵喵");
		Food food = new Fish("鱼");
		master.feed(cat, food);
		System.out.println("~~~~~~~~~~~~~~~~~");
		master.feed(dog, food);
	}

}
