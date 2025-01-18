package JavaPractice1;

public class FactorialNumberUsingRecursion {
	public static int fact = 1;

	public static void main(String[] args) {
		int no = 5;

		FactorialNumberUsingRecursion fact = new FactorialNumberUsingRecursion();
		fact.factCal(no);
		System.out.println(fact);
	}

	public void factCal(int no) {
		if (no >= 1) {
			fact = fact * no;
			no=no-1;
			factCal(no);

		}
	}
}
