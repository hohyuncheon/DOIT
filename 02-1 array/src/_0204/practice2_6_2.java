package _0204;
import java.util.Scanner;

//입력한 배열 값 역순으로 정렬해주기
public class practice2_6_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번 입력하시나요");
		int [] num = new int[sc.nextInt()];//입력값만큼 배열생성
		
		//배열에 값 입력
		for (int i = 0; i < num.length; i++) {
			System.out.println(i+1+"번째입력값은?");
			num[i]=sc.nextInt();
		}
		
		//입력된 배열 출력
		System.out.println("입력된 값");
		for (int i = 0; i < num.length; i++) {
			System.out.print (num[i] + " ");
		}
		
		//배열에 있는 역순으로 정렬
		
		for (int i = 0; i < num.length/2; i++) { //반절짜르고 앞뒤 배열끼리 바꿔준다.(홀수면 중간값은 안바꿔줘도됨)
			swap(num , i, num.length-i-1);
			
		}
		System.out.println();
		System.out.println("뒤집기시작!");
		for (int j = 0; j < num.length; j++) {
			System.out.print(num[j]+" ");
		}
		
	}
	//정렬
	private static void swap(int[] num, int i, int j) {
		int t = num[i];
		num[i] = num[j];
		num[j] = t;
		
	}
}
