package dsa.practice.kunal;

public class FebbonicSeries {

	public static void main(String[] args) {
		series(9, 0, 1);
	}
	
	public static void series(int n, int s, int e) {
		
		System.out.print(s+" "+e);
		
		for(int i=2; i<n; i++) {
			int temp = s+e;
			System.out.print(" "+temp);
			s=e;
			e=temp;
		}
	}
}
