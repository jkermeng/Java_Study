package fangwenfu;

public class fangwenfu {

	public int age = 1;
	private int a = 2;
	protected int b = 3;
	//	default void eat(){}//能在interface下创建
	private String name;
	public fangwenfu(String name) {
		super();
		this.name = name;
	}
	public fangwenfu() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
