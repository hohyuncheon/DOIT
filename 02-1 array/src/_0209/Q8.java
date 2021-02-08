package _0209;

import java.util.Scanner;

import _0209.Pratctice2_13.DayofBirth;

//dayOfYear를 변수 i와 days없이 구현하세요while
public class Q8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		for (;;) {
			System.out.println("그 해 경과 일수를 구해드립니다.");
			System.out.println("몇년도?"); int year = sc.nextInt();
			System.out.println("몇월?"); int month = sc.nextInt();
			System.out.println("몇일?"); int day = sc.nextInt();
			
			System.out.println(year+"년도 1월 1일부터 "+DayofBirth.dayOfYear(year,month,day)+"일 쨰입니다.");
			
			System.out.println("그만할까요? y/n");
			char yesorno =sc.next().charAt(0);
			
			if(yesorno == 'y') {
				break;
			}
		}
	}

	public static class DayofBirth{
		
		//윤년을 가리기위해 모든달을 2차배열에 넣음.
		public static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
						  { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 윤년
						};
		
		//윤년의 조건
		public static int isLeap(int year) {
			return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
		}
		
		
		public static int dayOfYear(int y, int m, int d) {
			
			while (--m != 0)
			d += mdays[isLeap(y)][m - 1];
			return d;
		}
	}
}
