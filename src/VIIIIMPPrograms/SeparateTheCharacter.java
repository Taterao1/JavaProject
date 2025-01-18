package VIIIIMPPrograms;

public class SeparateTheCharacter {

	public static void main(String[] args) {
		String str = "Selenium123@#$";
		char[] abc = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(abc[i])) {
				System.out.println("Int values are " + abc[i]);
			} else if (Character.isAlphabetic(abc[i])) {
				System.out.println("Alphabests are " + abc[i]);
			} else {
				System.out.println("Special characters are " + abc[i]);
			}

		}
	}

}
