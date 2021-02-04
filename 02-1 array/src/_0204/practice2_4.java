package _0204;
import java.util.Scanner;

public class practice2_4 {
//array parctice 배열 요소의 최댓값 구해보기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇개의 배열을 만들건가요");
		int [] num = new int[sc.nextInt()];
		
		//최댓값 구하기용
		int max = num[0];
		//배열에 값대입
		for (int i = 0; i < num.length; i++) {
			System.out.println("당신의 키는 몇인가요?");
			num[i]=sc.nextInt();
		}
		//출력
		for (int i = 0; i < num.length; i++) {
			if(num[i]>max) {
				max = num[i];
			}
		}
		System.out.println("max값은 : " + max);
	}

}
