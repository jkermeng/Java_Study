package daynight.learnoverride;

/**
 *
 *
 * @Author JKermeng
 * @Date 2019��10��15��
 * @Version 1.0.0
 */
public class Dog extends Animal {
	@Override
	public void bark() {
		super.bark();
		System.out.println("С����");
	}
}
