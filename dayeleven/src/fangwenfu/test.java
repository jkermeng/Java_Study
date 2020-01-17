package fangwenfu;

public class test {
	public static void main(String[] args) {
		fangwenfu fangwenfu = new fangwenfu();
		System.out.println(	fangwenfu.age);//可以在不同包，不同类中访问
		int b = fangwenfu.b;
		System.out.println(b);//protected 可以在同包不同类中访问
//		fangwenfu.c//不private 能被直接访问
	}

}
