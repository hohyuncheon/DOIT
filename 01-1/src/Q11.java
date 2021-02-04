import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int num = sc.nextInt();
		
		System.out.println("해당숫자는 : "+Integer.toString(num).length()+" 자리입니다");
	}

}
