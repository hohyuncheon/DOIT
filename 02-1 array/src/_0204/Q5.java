package _0204;

import java.util.Arrays;

//b배열의 모든 요소를 a에 역순으로 입력하시오
public class Q5 {
	public static void main(String[] args) {
		int [] b = new int [] {1,2,3,4,5};
		int [] a = new int[b.length];//a의 배열을 b배열크기만큼 지정
		
		rcopy(a,b);
		System.out.println("a배열");
		System.out.println(Arrays.toString(a));
		System.out.println("b배열");
		System.out.println(Arrays.toString(b));
		
	}
	
	static void rcopy(int[] a, int[] b) {
		for (int i = 0; i < b.length; i++) {
			a[i]=b[b.length-i-1]; //배열 반대로 넣기
		}
		
	}
}
