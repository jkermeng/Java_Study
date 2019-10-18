package dayfive.arr;

/**
 *
 *
 * @Author JKermeng
 * @Date 2019年10月10日
 * @Version 1.0.0
 */
public class school_work {
	public void third_one() {
		System.out.println("*");
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < i * 2; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

	public void third_two() {
		long n = 1;
		long sum = 0;// 初始化sum=0;
		for (int i = 1; i <= 20; i++) {
			n = n * i;
			sum = sum + n;
			System.out.println(sum);
		}

	}

	//
	public void third_three() {
		/*
		 * int j;
		 * 
		 * for (int i = 2; i <= 100; i++)
		 * 
		 * {
		 * 
		 * j = 2;
		 * 
		 * while (i % j != 0)
		 * 
		 * j++;
		 * 
		 * if (j == i)
		 * 
		 * System.out.println(i);
		 */

		int j;

		for (int i = 2; i <= 100; i++) // 1不是素数，所以直接从2开始循环

		{

			j = 2;

			while (i % j != 0)

				j++; // 测试2至i的数字是否能被i整除，如不能就自加

			if (j == i) // 当有被整除的数字时，判断它是不是自身

				System.out.println(i); // 如果是就打印出数字

		}

	}

	public void third_four() {

	}

	public void third_five() {
		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 100; i < 999; i++) {
			a = i / 100;
			b = i / 10 % 10;
			c = i % 10;
			if (i == (a * a * a + b * b * b + c * c * c))
				System.out.println(i);
		}
	}

	public void third_six() {
		int i, j, k;
		for (i = 1; i < 1000; i++) {
			int sum = 0;
			for (j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (sum == i) {
				System.out.println(i);
			}
		}
	}

	public void third_seven() {
		int G, M, X;
		for (G = 1; G < 20; G++) {
			for (M = 1; M < 33; M++) {
				for (X = 3; X < 99; X += 3) {
					if (G + M + X == 100 && G * 5 + M * 3 + X / 3 == 100)

						System.out.println("公鸡=" + G + "只，母鸡=" + M + "只,小鸡=" + X + "只");

				}

			}
		}
	}

	public void third_eight() {
		int a[] = { 30, 1, -9, 70, 25 };
		System.out.println("数组由大到小排序前：");
		for (int num : a) {
			System.out.print(num + "、");
		}
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				int temp = a[j];
				if (temp > a[j + 1]) {
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("\n数组由大到小排序后：");
		for (int num : a) {
			System.out.print(num + "、");
		}
	}

	public void th_one() {
		int s[] = { 1, 2, 3, 4, 4 };
		int c = 0;
		for (int i = 0; i < s.length; i++) {
			for (int a = 0; a < s.length; a++) {
				if (i != a && s[i] == s[a]) {
					c++;
				}
			}
		}
		if (c > 0) {
			System.out.println("重复");
		} else {
			System.out.println("不重复");
		}
	}
	public void th_two() {
		int x=35;

		int a[]=new int[32];

		for(int i=0;i<32;i++)

		{

		a[i]=x%2;

		x/=2;

		}

		for(int i=a.length-1;i>=0;i--)

		System.out.print(a[i]);
	}
	public void twoThree(){

		double[] n={50,1,40,44,66,55,99,88,5,10};
		for(int i=0;i<n.length-1;i++) {
			for(int j=0;j<n.length-1-i;j++) {
				if(n[j]>n[j+1]) {
					double tmpe=n[j];
					n[j]=n[j+1];
					n[j+1]=tmpe;
				}
			}
		}
		double sum=0;
		for(int k=1;k<n.length-1;k++) {
			sum+=n[k];
		}
		System.out.println(sum/6);
	}
	
	public static void main(String[] args) {

		
	}
}
