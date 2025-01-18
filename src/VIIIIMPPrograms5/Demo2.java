package VIIIIMPPrograms5;

public class Demo2 {

	public static void main(String[] args) {
		String str = "Taterao";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			boolean isDuplicate = false;

			for (int j = 0; j < res.length(); j++) {
				if (str.charAt(i) == res.charAt(j)) {
					isDuplicate = true;
				}
			}
			if (!isDuplicate) {
				res = res + str.charAt(i);

			}

		}
		System.out.print(res);
	}

}
