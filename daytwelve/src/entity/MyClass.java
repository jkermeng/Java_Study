package entity;

public class MyClass<T> {

	public void show(T t){
		System.out.println(t);
	}
	public void show2(int t){
		System.out.println(t);
	}
	public static void main(String[] args) {
		MyClass<String> mc = new MyClass<>();
		mc.show("x");
		mc.show2(11);
	}
}
