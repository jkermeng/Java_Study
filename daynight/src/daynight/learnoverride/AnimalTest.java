package daynight.learnoverride;

/**
 *
 *
 * @Author JKermeng
 * @Date 2019��10��15��
 * @Version 1.0.0
 */
public class AnimalTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Animal animal = new Animal();
		cat.bark();
		dog.bark();
		animal.bark();
	}

}
