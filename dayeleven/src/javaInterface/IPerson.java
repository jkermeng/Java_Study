package javaInterface;

public interface IPerson {
	public static final int i =10;
	public static void show(String name){
		System.out.println(name+"�ӿھ�̬����");
	}
	public abstract void show();
	public default void show(int i){
		System.out.println(i+"Ĭ�Ϸ���");
	}
		
	
	
}
