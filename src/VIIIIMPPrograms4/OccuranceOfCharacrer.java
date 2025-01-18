package VIIIIMPPrograms4;

public class OccuranceOfCharacrer {
	public static void main(String[] args) {
		String str = "ooooccccccrrrr";
		str = str.replaceAll(" ", "");
		// System.out.println(str);

		int[] arr = new int[126];

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
		}
		
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] > 0) {
				System.out.print((char) i);
			}
		}

	}

}
