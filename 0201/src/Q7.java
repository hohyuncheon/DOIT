
public class Q7 {
	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer();
		int sum = 0;
		for (int i = 0; i < 8; i++) {
			sum+=i;
			s.append(i);
			if (!(i==7)) {
				s.append(" + ");
			}
		}
		System.out.print(s);
		System.out.println(" = " + sum);
	}

}
