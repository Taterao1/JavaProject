package JavaPractice;

public class StringProg {
	public static void main(String[] args) {
		String str = "pooja";
		String s = "";

		int[] arr = new int[126];

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
		}
		for (int j = 0; j < str.length(); j++) {
			if (arr[str.charAt(j)] == 1) {
				s = s + str.charAt(j);
			}
		}
		System.out.println(s);

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'j') {
				System.out.println(s.charAt(i));
			}
		}
	}
}
