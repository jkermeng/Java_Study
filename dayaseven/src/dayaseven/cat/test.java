package dayaseven.cat;

import java.awt.CardLayout;
import java.util.Scanner;

/**
*
*
*@Author JKermeng
*@Date 2019年10月12日
*@Version 1.0.0
*/
public class test {
	static Cat cat;
	static Cat cat2;
	public static void main(String[] args) {
		cat = new Cat();

		cat.setName("小何");
		cat.setAge(2);
		cat.setSex("母");
		cat2.setAge(99);
		UpDate ud = new UpDate();
		Cat cat3[] = new Cat[10];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			cat = new Cat();
			System.out.println("动物名：");
			String name = scanner.next();
			cat.setName(name);
			System.out.println("动物年龄：");
			int age = scanner.nextInt();
			cat.setAge(age);
			System.out.println("动物性别：");
			String sex = scanner.next();
			cat.setSex(sex);
			cat3[i]=ud.UpDate(cat);
		}
		for (Cat cat : cat3) {
			System.err.println(cat);
		}
	
		
		
		
	}

}
