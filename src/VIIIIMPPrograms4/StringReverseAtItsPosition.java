package VIIIIMPPrograms4;

public class StringReverseAtItsPosition {

	public static void main(String[] args) {
		String str = "Taterao Gaikwad";
		String[] str1 = str.split(" ");

		for (int i = 0; i < str1.length; i++) {

			for (int j = str1[i].length() - 1; j >= 0; j--)
			{
				System.out.print(str1[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

}
