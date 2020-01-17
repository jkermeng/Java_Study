package javaInterface;

public interface IPerson {
	public static final int i =10;
	public static void show(String name){
		System.out.println(name+"接口静态方法");
	}
	public abstract void show();
	public default void show(int i){
		System.out.println(i+"默认方法");
	}
		
	
	
}
