package enumdemo;

import java.util.Random;

public class demo {

	public static void main(String[] args) {
		
		Random random = new Random();
		int nextInt = random.nextInt(MyEnum.values().length);
		for (MyEnum string : MyEnum.values()) {
			if(string.getKey()==nextInt){
				System.out.println(nextInt+"下标"+string.getValue());
			}
		}
		
	
	}
}

enum MyEnum{
	
	liu(0,"刘"),guan(1,"关"),zhang(2,"张");
	private int key;
	private String value;
	public int getKey() {
		return key;
	}
	public String getValue() {
		return value;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public void setValue(String value) {
		this.value = value;
	}
	private MyEnum(int key, String value) {
		this.key = key;
		this.value = value;
	}

}