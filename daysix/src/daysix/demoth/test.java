package daysix.demoth;

import java.util.Scanner;

/**
 *
 *
 * @Author JKermeng
 * @Date 2019��10��11��
 * @Version 1.0.0
 */


public class test {

	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner scint = new Scanner(System.in);
		int x;
		int y;
		float result = 0.0f;
		mothe mothe = new mothe();
		System.out.println("�����룺+��-��*��/");
		String wk = scanner.next();
		System.out.println("x");
		x = scint.nextInt();
		System.out.println("y");
		y = scint.nextInt();

		switch (wk) {
		case "+":
			result = mothe.jia(x, y);
			break;
		case "-":
			result = mothe.jian(x, y);
			break;
		case "*":
			result = mothe.cheng(x, y);
			break;
		case "/":
			result = mothe.chu(x, y);

			break;
		default:
			System.out.println("�������룡");
			break;
		}
		System.out.println("�����:"+result);


		mothe.x = scint.nextInt();
		mothe.y = scint.nextInt();
		if (wk.contains("+")) {
			result = mothe.jia();
			
		} else if (wk.contains("-")) {

			result = mothe.jian();

		} else if (wk.contains("*")) {

			result = mothe.cheng();

		} else if (wk.contains("/")) {
			result = mothe.chu();

		}
		System.out.println("�����:"+result);
	}

}
