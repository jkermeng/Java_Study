package dayfive.arr;

public class arr_learn {

	public static void main(String[] args) {
		int arr_int[] = new int[5];
		int arr_ints[] = { 1, 2, 3, 4, 5 };
		arr_int[0] = arr_ints[0];
		arr_int[1] = arr_ints[2];
		arr_int[2] = arr_ints[1];
		arr_int[4] = arr_ints[4];
		arr_int[3] = arr_ints[3];
		System.out.println(arr_int[1] + "----" + arr_ints);
		// arr_int = arr_ints;
		System.out.println((arr_int == arr_ints) + "----" + arr_ints.equals(arr_int));
		String arr_str[] = new String[4];
		String arr_strs[] = { "2", "asd", "zxc", "123" };
		double arr_doub[] = new double[4];
		double arr_doubs[] = { 2.2, 2.33, 2.4444, 2.6678 };

		Short arr_sts[] = { 2, 3, 5, 6, 7 };
		Short arr_st[] = new Short[arr_sts.length];

		System.err.println("========================");
		String str = "我是jk i am jk";
		byte byt[] = str.getBytes();
		for (byte b : byt) {
			System.out.println(b);
		}

		System.out.println("--------------------");
		int it[] = { 5, 10, 11, 40, 15, 20, 30, -5, 8, 28, 3, 6 };

		// self solution max
		int n1 = 0;
		int max1 = 0;
		for (int n = 0; n < it.length; n++) {
			if (n1 < it[n]) {
				n1 = it[n];
			}

		}
		System.out.println("最大值" + n1);
		// self solution max index
		int n2 = 0;
		int max2 = 0;
		for (int n = 0; n < it.length; n++) {
			if (it[n2] > it[n]) {
				n2 = n;
			}

		}
		System.out.println("最大值下标" + n2);
		System.out.println("---------------------");
		// 最大值
		int max = it[0];
		for (int i = 0; i < it.length; i++) {
			if (it[i] > max) {
				max = it[i];
			}

		}
		System.out.println("asdasd" + max);
		// 最大值下标
		int minIndex = 0;
		for (int i = 0; i < it.length; i++) {
			if (it[minIndex] > it[i]) {
				minIndex = i;
			}
		}
		System.out.println("====================");
		System.out.println(it[it.length - 1]);
		// self min
		int min = 0;
		for (int i = 0; i < it.length; i++) {
			if (min > it[i]) {
				min = it[i];
			}
		}
		System.out.println("最小值" + min);
		// self min index
		int minIdex = 0;
		int take = 0;
		for (int i = 0; i < it.length; i++) {
			if (minIdex > it[i]) {
				take = i;
			}
		}
		System.out.println("最小值下标" + take);
		// 最小值
		int min1 = 0;
		for (int i = 0; i < it.length; i++) {
			if (min1 > it[i]) {
				min1 = it[i];
			}
		}
		System.out.println("最小值" + min1);
		// 选择排序
		for (int i = 0; i < it.length; i++) {
			int max3 = it[i];
			for (int j = i + 1; j < it.length; j++) {
				if (it[i] < it[j]) {
					max = it[j];
					it[j] = it[i];
					it[i] = max;
				}
			}

		}
		for (int i : it) {
			System.out.print(" 从新 " + i);
		}
		// 冒泡排序
		System.out.println("====================");
		int temp = 0;
		for (int i3 = 0; i3 < it.length; i3++) {
			for (int j3 = 0; j3 < it.length - i3 - 1; j3++) {
				if (it[j3] > it[j3 + 1]) {
					temp = it[j3];
					it[j3] = it[j3 + 1];
					it[j3 + 1] = temp;
				}
			}
		}
		for (int i : it) {
			System.out.println(i + " ");
		}

		// 二分法
		int nunmber[] = { 5, 9, 12, 58, 69, 101 };
		int start = 0;
		int end = nunmber.length - 1;
		int findnumber = 200;
		int findindex = -1;
		int middle;
		while (start < end) {
			middle = (start + end) / 2;
			if (findnumber > nunmber[middle]) {// 第一次5 第二次2 第三次1
				start = middle + 1;// 3
			}
			if (findnumber < nunmber[middle]) {
				end = middle - 1;// end 4 end 2

			}
			if (findnumber == nunmber[middle]) {// 第一次99第二次9第三次3
				findindex = middle;
				break;
			}
		}
		if (findindex == -1) {

		}

	}

}
