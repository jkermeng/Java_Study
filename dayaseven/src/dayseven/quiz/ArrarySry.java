package dayseven.quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 *
 * @Author JKermeng
 * @Date 2019Äê10ÔÂ14ÈÕ
 * @Version 1.0.0
 */
public class ArrarySry {
	private static int num[];

	public ArrarySry(int num[]) {
		this.num = num;
	}

	public static void sorts() {

		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}

	public static void sorts(String str) {
		String a = null;
		String b = null;
		if (str.length() == 1) {
			System.out.println(str);
		} else {
			a = str.substring(0, str.length() - 1);
			b = str.substring(str.length() - 1);
			System.out.println(b);
			sorts(a);
		}

	}
}
