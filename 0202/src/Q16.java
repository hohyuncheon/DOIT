import java.util.Scanner;

//왼쪽위가 직각 오른쪽 아래가 직각
public class Q16 {

	public static void main(String[] args) {  

        Scanner sc = new Scanner(System.in);
        System.out.println("피라미드 층수입력:");

        int num = sc.nextInt();
        
        
        for (int i = 0; i < num; i++) {
			
        	for (int j = 1; j < num-i; j++) {
				System.out.print(" ");
			}
        	for (int j = 0; j < i*2+1; j++) {
				System.out.print("*");
			}System.out.println();
		}
    }
}