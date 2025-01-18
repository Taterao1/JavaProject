package NumberPattern;

public class Demo2 {
	public static void main(String[] args) {
		String str = "My name is pooja";

		// pooja is name My
		// pooja is name My
		String[] str1 = str.split(" ");

		for (int i = str1.length - 1; i >= 0; i--) {
			System.out.print(str1[i] + " ");
		}

	}
}
