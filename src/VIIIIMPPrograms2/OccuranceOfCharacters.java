package VIIIIMPPrograms2;

public class OccuranceOfCharacters {
	public static void main(String[] args) {
		String str = "aabbbccdddde";

		int[] arr = new int[126];

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;

		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				System.out.println((char) i + " Repeated character in the string are " + arr[i]);
			}

		}

	}

}
