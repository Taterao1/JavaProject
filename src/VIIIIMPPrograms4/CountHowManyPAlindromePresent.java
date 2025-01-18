package VIIIIMPPrograms4;

public class CountHowManyPAlindromePresent {
	public static void main(String[] args) {
		String[] str = { "madam", "amita", "bab", "ELE", "12321" };
		int count = 0;

		for (int i = 0; i < str.length; i++) {
			String rev = "";
			String str1 = str[i];

			for (int j = str1.length() - 1; j >= 0; j--) {
				rev = rev + str1.charAt(j);

			}
			if (str1.equals(rev)) {
				count++;

			}

		}
		System.out.println(count);

	}

}
