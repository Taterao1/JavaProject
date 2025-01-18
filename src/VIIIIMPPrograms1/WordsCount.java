package VIIIIMPPrograms1;

public class WordsCount {

	public static void main(String[] args) {

		String str = "The Mother India Hyderabad Delhi";
		boolean b = true;

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				b = true;

			} else if (b == true) {
				b = false;
				count++;// 1
			}
		}
		System.out.println(count);// 1
	}
}
