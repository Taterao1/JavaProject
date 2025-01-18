package VIIIIMPPrograms4;

public class WordsCount1 {
	public static void main(String[] args) {
		int count = 0;
		boolean b = true;

		String str = "Taterao Gaikwad Automation Test Engineer";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				b = true;
			} else if (b == true) {
				b = false;
				count++;
			}

		}
		System.out.println(count);
	}
}
