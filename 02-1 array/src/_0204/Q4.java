package _0204;

import java.util.Arrays;

//배열 B의 모든 요소를 배열 A에 복사하는 메서드 COPY를 작성하시오
public class Q4 {
	public static void main(String[] args) {
		int [] b = new int [] {1,2,3,4,5};
		int [] a = new int[b.length];//a의 배열을 b배열크기만큼 지정
		
		copy(a,b);
		System.out.println("a배열");
		System.out.println(Arrays.toString(a));
		System.out.println("b배열");
		System.out.println(Arrays.toString(b));
		
	}
	
	static void copy(int[] a, int[] b) {
		for (int i = 0; i < b.length; i++) {
			a[i]=b[i];
		}
		
	}

}
