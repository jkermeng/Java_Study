package dayfive.arr;

import java.util.Arrays;

/**
*
*
*@Author JKermeng
*@Date 2019��10��10��
*@Version 1.0.0
*/
public class arr_arry {

	public static void main(String[] args) {
		
		int[] a1 = {5,6,1};
		int[] a2 = {5,6,1,2};
		int[] a3 = {5,6,1,5};
		boolean equals = Arrays.equals(a1, a2);
		System.out.println(equals);
		a1 = a2;
		boolean equals2 = Arrays.equals(a1, a2);
		System.out.println(equals2);
		
		int b = Arrays.binarySearch(a3, 5);
		System.out.println(b);
		
		int b1[][] = new int[3][2];
		b1[0][0]=1;
		b1[0][1]=2;
		b1[1][0]=3;
		b1[1][1]=4;
		b1[2][0]=5;
		b1[2][1]=6;
		for(int i = 0 ;i<3;i++){
			for(int j = 0;j<2;j++){
				System.out.printf(b1[i][j]+" ");
			}
		}
		for (int[] is : b1) {
			for (int i : is) {
				System.out.printf(i+" ");
			}
		}
	}

}
