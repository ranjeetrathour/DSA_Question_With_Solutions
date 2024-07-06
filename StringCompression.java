package dsa.practice.string;

// input - aaabbbbccc
// output - a3b4c3
public class StringCompression {

	public static void main(String[] args) {
		String input = "aaabbbbcccjjjj";
		StringBuilder output = new StringBuilder();
		int count = 1;

		for (int i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i) == input.charAt(i + 1)) {
				count++;
			} else {
				output.append(input.charAt(i)).append(count);
				count = 1;
			}
		}
		// last character to bhar append isliye kar rahe kyoki string ki length loop to terminate kar rahhi hai
		output.append(input.charAt(input.length() - 1)).append(count);

		System.out.println(output.toString());
	}
}
