package dayfour.quiz;

import java.util.Scanner;

public class eighth_test {

	public void one() {
		int a = 10;
		int b = 10;
		int c = 12;
		int x = a + b++;
		int y = a + (--c);
		int z = b + c++;
		System.out.println("a" + a);
		System.out.println("b" + b);
		System.out.println("c" + c);
		System.out.println("x" + x);
		System.out.println("y" + y);
		System.out.println("z" + z);
		System.out.println("-------------------------------------------------");
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");

	}

	public void two() {
		int a = 7;
		int b = 9;
		System.out.println("--a%b++:" + --a % b++);
		System.out.println("(a>=1&&a<=9?a:b):" + (a >= 1 && a <= 9 ? a : b));
		System.out.println("a++%b--:" + a++ % b--);
		System.out.println("-------------------------------");
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");

	}

	public void three() {
		System.out.println("(3<4&&(6==(5-1))):::" + (3 < 4 && (6 == (5 - 1))));
		System.out.println("(3<5||(6==7)||3!=3):::" + (3 < 5 || (6 == 7) || 3 != 3));
		System.out.println("(!(5==2+3)&&!(6+2!=8)):::" + (!(5 == 2 + 3) && !(6 + 2 != 8)));
		System.out.println("-------------------------------");
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");

	}

	public void four() {
		int i = 1;
		int j = 0;
		while (i <= 50) {

			if (i % 2 == 0) {
				j++;
				System.out.print(i + " ");
				if (j == 5) {

					System.out.println();
					j = 0;
				}
				
			}

			i++;
		}
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");

	}

	public void five() {
		System.out.println("����һ����ֵ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i != 0) {
			if (i % 2 == 0) {
				System.out.println("��ż��");
			} else {
				System.out.println("������");
			}
		} else {
			System.out.println("�����ʽ����������");

		}
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");

	}

	public void six() {
		Scanner sc = new Scanner(System.in);
		System.out.println("����a��ֵ");
		int a = sc.nextInt();
		System.out.println("����b��ֵ");
		int b = sc.nextInt();
		int c = 0;
		System.out.println("ԭa��" + a + "ԭb��" + b);
		if (a >= b) {
			c = a;
			a = b;
			b = c;
			System.out.println("�Ѿ��������aֵ" + a + "�Ѿ��������aֵ" + b);

		} else {
			System.out.println("����������a��ֵ��" + a + "����������b��ֵ��" + b);
		}
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");

	}

	public void seven() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ݔ���һ���ܴa");
		int number = sc.nextInt();
		int p_number = 123456;
		int p_number2 = 654321;
		if (number != 0) {
			if (number == p_number) {
				System.out.println("ݔ��ڶ����ܴa");
				int number2 = sc.nextInt();
				if (number2 != 0) {
					if (number2 == p_number2) {
						System.out.println("�ɹ�����");
					} else {
						System.out.println("���벻��ȷ");
					}
				} else {
					System.out.println("�Ƿ�����");
				}

			} else {
				System.out.println("���벻��ȷ");
			}
		} else {
			System.out.println("�Ƿ�����");
		}
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");
	}

	public void eight() {
		Scanner sc = new Scanner(System.in);
		boolean st = true;
		while (st) {
			System.out.println("����0�˳�ѭ��");
			System.out.println("�������·���ֵ:");
			int number = sc.nextInt();
			if (number > 12) {
				System.err.println("�Ƿ�����");
			} else if (number == 0) {
				st = false;
				System.out.println("���˳�");
			} else if (number == 1 || number <= 3) {
				System.out.println("����");
			} else if (number == 4 || number <= 6) {
				System.out.println("����");
			} else if (number == 7 || number <= 9) {
				System.out.println("����");
			} else if (number == 10 || number <= 12) {
				System.out.println("����");
			}

		}
	}

	public static void main(String[] args) {
		eighth_test et = new eighth_test();
		et.one();
		et.two();
		et.three();
		et.four();
		et.five();
		et.six();
		et.seven();
		et.eight();

	}
}
