package VIIIIMPPrograms1;

public class Demo3 {
	public static void main(String[] args) {
		String str = "a2d3b4";

		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				System.out.print(str.charAt(i));
			} else {
				int a = Character.getNumericValue(str.charAt(i));

				for (int j = 0; j < a; j++) {
					System.out.print(str.charAt(i - 1));
				}
			}
		}
	}

}
