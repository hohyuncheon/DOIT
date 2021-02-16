package _0217;

import java.util.Arrays;
import java.util.Scanner;

public class practice3_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] arr = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };

		System.out.println("원하는 키는?");
		String search = sc.next();
		int idx = Arrays.binarySearch(arr, search);

		if (idx >= 0)
			System.out.println("찾고자하는 값은 " + idx + "번째 배열에 있습니다 ");// 배열의 위치를 말해줌
		else
			System.out.println("값이 없습니다");
	}

}
