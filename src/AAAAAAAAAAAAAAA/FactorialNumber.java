package AAAAAAAAAAAAAAA;

public class FactorialNumber {
	static int fact = 1;

	public static void main(String[] args) {
		int num = 5;
		ffact(num);
		System.out.println(fact);
	}

	public static void ffact(int no) {
		if (no >= 1) {
			fact = fact * no;
			ffact(no - 1);

		}
	}

}
