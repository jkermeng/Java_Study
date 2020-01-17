package javaInterface;

public class Student implements IPerson {

	@Override
	public void show() {
		System.out.println("Student 重写IPerson接口的抽象方法");
	}

}
