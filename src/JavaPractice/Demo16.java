package JavaPractice;

public class Demo16 {

	public static void main(String[] args) {
		String actual = " Carton # 1709202301 already added to BOL # 0103971CGS";
		String expected = " Carton # 1709202301 already added to BOL # 0103981CGS";
		System.out.println("Actual: " + actual);
		System.out.println("Expected: " + expected);

		// Define a regex pattern to match the BOL number format
		String regexPattern = "\\d+CGS"; // matches sequence of numbers followed by "CGS"

		// Remove the BOL numbers based on the pattern
		actual = actual.replaceAll(regexPattern, "");
		System.out.println("Actual after replacement: " + actual);

		expected = expected.replaceAll(regexPattern, "");
		System.out.println("Expected after replacement: " + expected);

		// Now compare the modified strings after trimming
		if (actual.trim().equals(expected.trim())) {
			System.out.println("TC Pass");
		} else {
			System.out.println("TC Fail");
		}
	}
}
