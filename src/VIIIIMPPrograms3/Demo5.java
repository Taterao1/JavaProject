package VIIIIMPPrograms3;

public class Demo5 {
	public static void main(String[] args) {
		String s = "Taterao Gaikwad";
		String str[] = s.split(" ");

		char c = ' ';

		for (int i = 0; i < str.length; i++) {
			String str1 = str[i];

			for (int j = str1.length() - 1; j >= 0; j--) {
				System.out.print(str1.charAt(j));

			}
			System.out.print(" ");

		}

	}

}
