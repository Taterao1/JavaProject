package VIIIIMPPrograms2;

public class StringBubbleSort1 {
	public static void getBubbleSortValues(String str[]) {
		for (int pass = 0; pass < str.length; pass++) {
			String temp;

			for (int i = 0; i < str.length - 1; i++) {
				if (str[i].compareTo(str[i + 1]) > 0) {
					temp = str[i];
					str[i] = str[i + 1];
					str[i + 1] = temp;

				}
			}
		}
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

	}

	public static void main(String[] args) {
		String[] s = { "banana", "apple", "mango" };
		StringBubbleSort1.getBubbleSortValues(s);

	}

}
