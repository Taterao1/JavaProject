package JavaPractice;

public class CountString {

	public static void countString(String str) {

		boolean b = true;
		int count = 0;
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

	public static void main(String[] args) {
		String str = "Taterao Gaikwad QAAutomationEngineer Delhi";
		CountString.countString(str);
	}

}
