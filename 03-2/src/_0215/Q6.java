package _0215;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//검색에 실패하면 삽입 포인트의 값을 출력하는 프로그램을 작성

public class Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번 입력할까요");

		int[] arr = new int[sc.nextInt()];

		System.out.print("0번 인덱스 (오름차순으로 입력하시오) : ");
		arr[0] = sc.nextInt();
		System.out.println("정상입력되었습니다\n");

		// 오름차순이 아닐시에 취소
		for (int j = 1; j < arr.length; j++) {
			do {
				System.out.print(j + "번 인덱스 (오름차순으로 입력하시오) : ");
				arr[j] = sc.nextInt();

			} while (arr[j] <= arr[j - 1]);
			System.out.println("정상입력되었습니다\n");
		}

		// 찾고싶은 값
		System.out.println("찾고싶은 값을 입력하시오 : ");
		int num = sc.nextInt();
		
		int num2 = Arrays.binarySearch(arr, num);// arr배열에서 num값을 찾자
		if(num2>0) {
			System.out.println(num + "은 " + num2 + "번 인덱스에 있습니다");
		}else 
			System.out.println("값이 없습니다");
			System.out.println((-num2+1)+"인덱스에 들어가야 합니다");

	}

}
