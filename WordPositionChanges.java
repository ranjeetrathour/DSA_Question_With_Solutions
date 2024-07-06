package dsa.practice.string;

public class WordPositionChanges {

	public static void main(String[] args) {
		String input = "my3 this1 is2 name4";		
		String[] temp = input.split(" ");
		String[] output = new String[temp.length];
		
		for (String string : temp) {
			int pos = Character.getNumericValue(string.charAt(string.length()-1)-1);
			output[pos] = string.substring(0, string.length()-1);
		}
		
		for (String string : output) {
			System.out.print(string+" ");
		}
	
		
	}
}
