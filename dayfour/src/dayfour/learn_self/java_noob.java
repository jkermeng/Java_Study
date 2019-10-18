package dayfour.learn_self;

import java.util.Random;

public class java_noob {

	public static void main(String[] args) {
		System.out.println(Math.pow(3, 8));
		for (int i = 0; i < 10; i++) {
			Random rnd = new Random();
			int d = rnd.nextInt(26) + 97;
			char c = (char) d;
			System.out.print(c);
		}
		int i = 0, j = 0;
		do {
			System.out.println("我爱你中国");
			i++;
		} while (i <= 70);
		for (; j <= 70; j++) {
			j++;
			System.out.println("我爱你中国");

		}

		for (int a = 1; a <= 9; a++) {
			System.out.println(" ");

			for (int b = 1; b <= a; b++) {

				System.out.print(a + "*" + b + "=" + a * b + "\t");

			}
		}
		int v = 0;
		for (int i1 = 0; i1 <= 100; i1++) {
			if (i1 % 2 == 0) {
				v += i1;

			}

		}
		System.out.println(v);
		Character ch = 'a';
		char c = test('x');
		System.out.println(c);

		int b = 0;
		int a = 0;
		int d = 0;
		for (int dd = 100; dd < 1000; dd++) {
			a = dd % 10;// 个位
			b = dd % 100 / 10;// 十位
			d = dd % 1000 / 100;// 百位
			if (a * a * a + b * b * b + d * d * d == dd) {
				System.out.println(dd);
			}
		}

		wc: for (int w = 0; w < 20; w++) {
			for (int a1 = 0; a1 < 20; a1++) {
				if (a1 == 4) {
					System.out.println("  " + a1);
					break wc;
				}
			}
		}

	}

	private static char test(char c) {
		Character ch = c;
		return ch;
	}

}
