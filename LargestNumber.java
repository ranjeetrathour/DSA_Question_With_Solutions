package dsa.practice.kunal;

public class LargestNumber {

	public static void main(String[] args) {
		int a = 1090;
		int b = 110;
		int c = 1344;

//		if(a>b) {
//			if(a>c) {
//				System.out.println(a);
//			}else {
//				System.out.println(c);
//			}
//		}
//		else {
//			if(b>c) {
//				System.out.println(b);
//			}else {
//				System.out.println(c);
//			}
//		}

//		int res = a > b ? a > c ? a : c : b > c ? b : c;
		int res = Math.max(c, Math.max(a, b));
		System.out.println(res);
	}
}
