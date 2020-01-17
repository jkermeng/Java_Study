package javaInterface;

import fangwenfu.fangwenfu;

public class test {


	public static void main(String[] args) {


		System.out.println("接口的final"+Student.i);
		new Student().show();
		new Student().show(2);
		fangwenfu fangwenfu = new fangwenfu("战士");
		System.out.println(fangwenfu);
		fangwenfu fangwenfu2 = (fangwenfu)fangwenfu;
		System.out.println(fangwenfu2);
		fangwenfu2 = fangwenfu;
		System.out.println(fangwenfu2);
		System.out.println(fangwenfu2.getName());
		System.out.println("--------------");
		System.out.println(fangwenfu.age);
		Student s = new Student();
		
	}
}
