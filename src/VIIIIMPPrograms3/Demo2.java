package VIIIIMPPrograms3;

public class Demo2 {

	public static void main(String[] args) {
		String str = "Taterao Gaikwad";

		String[] str1 = str.split(" ");

		for (int i = 0; i < str1.length; i++) {
			String s = str1[i];

			for (int j = s.length() - 1; j >= 0; j--) {
				System.out.print(s.charAt(j));
			}
			System.out.print(" ");

		}
	}

}
