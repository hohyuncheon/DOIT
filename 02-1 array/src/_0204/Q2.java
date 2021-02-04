package _0204;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		int[] num = new int[] { 5, 10, 73, 2, -5, 42 };
//		int[] num = new int[] { 1, 2, 3, 4, 5, 6 };

		// 값출력
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

		// 값 변환
		System.out.println();
		for (int i = 0; i < num.length / 2; i++) {
			System.out.println();
			System.out.println(i + 1 + "값과 " + (num.length - i) + "값을 변환합니다\n");
			sort(num, i, num.length - i - 1);
			// 값출력
			for (int j = 0; j < num.length; j++) {
				System.out.print(num[j] + " ");
			}
		}
	}

	private static void sort(int[] num, int i, int j) {
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}
}
