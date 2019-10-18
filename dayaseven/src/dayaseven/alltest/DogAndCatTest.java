package dayaseven.alltest;

import dayaseven.animal.Cat;
import dayaseven.animal.Dog;

/**
 *
 *
 * @Author JKermeng
 * @Date 2019��10��12��
 * @Version 1.0.0
 */
public class DogAndCatTest {
	static Dog dog;
	static Cat cat;

	public static void main(String[] args) {
		dog = new Dog();
		cat = new Cat();
		dog.setAge(11);
		System.out.println(dog.getAge());
		cat.setAge(12);
		System.out.println(cat.getAge());
		System.out.println(dog.toString());
	}

}
