package VIIIIMPPrograms1;

public class MinimumOccuranceOfCharacter {

	public static void main(String[] args) {
		String str = "bbaaccdddde";
		

		int[] arr = new int[126];

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;

		}

		int min = str.length();
		char c = ' ';

		for (int i = 0; i < str.length(); i++) {
			if (min > arr[str.charAt(i)]) {
				min = arr[str.charAt(i)];

				c = str.charAt(i);
			}
		}
		System.out.println("Minimum occurance of character is " + c);

	}

}
