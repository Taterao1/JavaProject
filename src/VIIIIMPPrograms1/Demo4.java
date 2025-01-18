package VIIIIMPPrograms1;

public class Demo4 {

	public static void main(String[] args) {
		String str = "a2z4a3";

		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				System.out.print(str.charAt(i));// a
			} else {
				int a = Character.getNumericValue(str.charAt(i));

				for (int j = 1; j < a; j++) {
					System.out.print(str.charAt(i - 1));// a
				}
			}
		}

	}

}
