package VIIIIMPPrograms3;

public class Demo3 {

	public static void main(String[] args) {
		String str = "Taterao Gaikwad";

		String[] s = str.split(" ");

		for (int i = s.length - 1; i >= 0; i--) {

			for (int j = s[i].length() - 1; j >= 0; j--) {
				System.out.print(s[i].charAt(j));
			}

			System.out.print(" ");
		}

	}

}
