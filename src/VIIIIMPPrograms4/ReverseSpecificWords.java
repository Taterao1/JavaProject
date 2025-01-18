package VIIIIMPPrograms4;

public class ReverseSpecificWords {
	public static void main(String[] args) {
		String str = "Tatetrao QA Automation Engineer";
		String[] str1 = str.split(" ");

		for (int i = 0; i < str1.length; i++) {
			String str2 = str1[i];

			if (str2.equals("Automation")) {
				for (int j = str2.length() - 1; j >= 0; j--) {
					System.out.print(str2.charAt(j));
				}

			} else {
				System.out.print(str2);
			}
			System.out.print(" ");
		}

	}

}
