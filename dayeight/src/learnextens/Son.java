package learnextens;

/**
 *
 *
 * @Author JKermeng
 * @Date 2019��10��14��
 * @Version 1.0.0
 */
public class Son extends Farther {

	public int age = 10;
	public Son(){
		
	}
	public Son(int age){
		this();
		System.out.println("1");
	}
	public Son(int age,String name){
		this(age);
		eat();
	}
	public void eat(int age) {
		super.eat();
		System.out.println("�Ա���"+this.age);
	}

}
