package _0204;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번 입력하시나요");
		int [] num = new int[sc.nextInt()];//입력값만큼 배열생성
		
		//배열에 값 입력
		for (int i = 0; i < num.length; i++) {
			System.out.println(i+1+"번째입력값은?");
			num[i]=sc.nextInt();
		}
		
		System.out.println("합계값은 : "+sumOf(num));

	}
	static int sumOf(int[] num) {
		
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum+=num[i];
		}
		return sum;
	}

}
