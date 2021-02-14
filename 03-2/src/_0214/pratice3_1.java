package _0214;

import java.util.Scanner;

public class pratice3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번 할까요");
		int [] arr = new int[sc.nextInt()];
		
		//배열에 값 넣기
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+1+"번째 값은 : ");
			arr[i]=sc.nextInt();
		}
		
		//찾고자 하는 값
		System.out.println("찾고싶은 값은 뭔가요");
		int num = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==num) {
				System.out.println(i+1+"번째에 있습니다");
			}
		}
	}

}
