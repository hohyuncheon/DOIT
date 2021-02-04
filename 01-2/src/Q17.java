import java.util.Scanner;

public class Q17 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자피라미드 층수입력:");

		int num = sc.nextInt();

		for (int i = 0; i <= num; i++) {

			for (int j = 0; j < num-i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j < i*2; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}
}
