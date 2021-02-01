import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		do{
			System.out.println("num1 정수를 입력하시오");
			int num1 = sc.nextInt();
			System.out.println("num2 정수를 입력하시오");
			int num2 =sc.nextInt();
			if(num1>num2) {
				System.out.println("num2보다 작은 값을 쓰시오");
				return;
			}
			System.out.println();
			System.out.println(num2-num1);
			System.out.println();
		}while(true);
	}

}
