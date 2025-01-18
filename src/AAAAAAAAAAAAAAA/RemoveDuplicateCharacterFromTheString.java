package AAAAAAAAAAAAAAA;

public class RemoveDuplicateCharacterFromTheString {
	public static void main(String[] args) {
		String str = "analogy";

		int[] arr = new int[126];

		// Count occurrences of each character
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
		}

		// Print characters that occur exactly once
		for (int j = 0; j < str.length(); j++) {
			if (arr[str.charAt(j)] == 1) {
				System.out.print(str.charAt(j));
				break;
			}
		}
	}
}
