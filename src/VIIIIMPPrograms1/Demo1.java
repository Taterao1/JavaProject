package VIIIIMPPrograms1;

public class Demo1 {
	public static void main(String[] args) {
		String str = "aezxiou";

		int vowels = 0;
		int consonents = 0;

		char currentChar = ' ';

		for (int i = 0; i < str.length(); i++) {
			currentChar = str.charAt(i);
			if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o'
					|| currentChar == 'u') {
				vowels++;

			} else if (currentChar >= 'a' && currentChar <= 'z') {

				consonents++;

			}

		}
		System.out.println(vowels);
		System.out.println(consonents);

	}

}
