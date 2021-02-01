import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 두번 입력하시오");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int dif = 0;

		int sum = 0;
		if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				sum += i;
			}
		}
		if (num2 > num1) {
			for (int i = num1; i <= num2; i++) {
				sum += i;
			}
		}

		System.out.println(" 합계값 : " + sum);
	}

}
