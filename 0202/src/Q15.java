import java.util.Scanner;

public class Q15 {
	//직각 이등변 삼각형을 출력하는 부분을 아래와 같은 형식의 메서드로 작성하세요
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("직각 이등변 삼각형 몇줄만들까요");
		triangleLB(sc.nextInt());
		System.out.println("왼쪽위가 직각 몇줄만들까요");
		triangleRU(sc.nextInt());//왼쪽위가 직각
		System.out.println("오른쪽 아래가 몇줄만들까요");
		triangleRB(sc.nextInt());// 오른쪽 아래가 직각
		

	}

	private static void triangleLB(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
	}
	
	private static void triangleRU(int num) {

		for (int i = num; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void triangleRB(int num) {


		for (int i = num; i >= 0; i--) {

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = num; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
