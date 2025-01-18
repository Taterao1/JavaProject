package VIIIIMPPrograms3;

public class StringReverseSpecificString {
	public static void main(String[] args) {
		String s = "Selenium Java Cucumber";
		String[] str = s.split(" ");

		for (int i = 0; i < str.length; i++) {
			String str1 = str[i];

			if (str1.equals("Java")) {
				for (int j = str1.length() - 1; j >= 0; j--) {
					System.out.print(str1.charAt(j));
				}
			} else {
				System.out.print(str1);
			}
			System.out.print(" ");
		}
	}

}
