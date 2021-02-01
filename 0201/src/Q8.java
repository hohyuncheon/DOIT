import java.util.Scanner;

public class Q8 {

	//1~10까지의 합 = (1+10)*5
	//가오스의 덧셈
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가오스의 덧셈 정수를 입력하시오");
		int num = sc.nextInt();
		
		int sum = (num + 1) * (num/2);
		if(num%2 != 0) sum += (num + 1)/2;
		
		System.out.println(sum);
	}
}
