package daysix.character.test;

import java.util.Scanner;

import daysix.character2.ShangPingGuangLi;
import daysix.character2.Update;

/**
*
*
*@Author JKermeng
*@Date 2019Äê10ÔÂ11ÈÕ
*@Version 1.0.0
*/
public class ShangPingGuangLiTest {
	static Scanner sc;
	static ShangPingGuangLi spgl;
	static Update update ;
	public static void main(String[] args) {
		 sc = new Scanner(System.in);
		spgl = new ShangPingGuangLi();
		update = new Update();
		 System.out.println("id");
		update.id=sc.nextInt();
		 System.out.println("name");
		update.name=sc.next();
		System.out.println("price");
		update.price=sc.nextFloat();
		 System.out.println("num");
		update.num=sc.nextInt();
		spgl.SaveShangPing();
//
//		 for (ShangPingGuangLi string : spgl) {
//			 
//			 System.out.println(string);
//			
//		}
		 
		 
		 
		 
		 
	}

}
