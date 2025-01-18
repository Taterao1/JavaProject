package VIIIIMPPrograms;

public class DuplicateCharacter {

	public static void getData(String str) {
		int[] arr = new int[126];

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				System.out.print((char) i );
			}
		}

	}

	public static void main(String[] args) {
		String str = "aabbccdde";
		DuplicateCharacter.getData(str);
	}

}
