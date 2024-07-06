package dsa.practice.string;

public class FindingMissingNumber {

	public static void main(String[] args) {
		String s = "124567";
		int len = s.length();
		int k=0;
		for (int i = 1; i < len; i++) {
			int value = Character.getNumericValue(s.charAt(k));
			int sec = Character.getNumericValue(s.charAt(i));
			if(value==(sec-1)) {
				k++;
				continue;
			}else {
				System.out.println(sec-1);
				break;
			}
			
			
		}
	}
}
