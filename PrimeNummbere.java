package dsa.practice.kunal;

public class PrimeNummbere {

	public static void main(String[] args) {
		check(18);
	}

	private static void check(int i) {

		if(i==1) {
			System.out.println("yes");
		}
		
		for(int j=2; j<=i;j++) {
			if(i%j==0) {
				System.out.println("no");
				break;
			}
			System.out.println("yes");
			break;
		}
		
	}
}
