package VIIIIMPPrograms4;

public class CountVowelsAndConsonentsInTheString {
	public static void main(String[] args) {

		String str = "atevorirobbbu";

		str = str.toLowerCase().replaceAll(" ", "");
		// System.out.println(str);

		int lowerCase = 0;
		int upperCase = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				lowerCase++;

			} else if (c >= 'a' && c <= 'z') {
				upperCase++;
			}
		}
		System.out.println(lowerCase);
		System.out.println(upperCase);

	}

}
