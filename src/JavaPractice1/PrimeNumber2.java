package JavaPractice1;

public class PrimeNumber2 {
	public static void main(String[] args) {
		int no = 7;
		int a = 0;

		for (int i = 1; i <= no; i++) {
			if (no % i == 0) {
				a = 1;
			}
		}
		if (a == 1) {
			System.out.println("No is not prime");
		} else {
			System.out.println("No is prime");
		}
	}
}
