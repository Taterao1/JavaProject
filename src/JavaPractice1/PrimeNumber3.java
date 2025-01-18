package JavaPractice1;

public class PrimeNumber3 {
	public static void main(String[] args) {
		for (int no = 2; no <= 100; no++) {
			boolean b = false;
			for (int i = 2; i <= no; i++) {
				if (no % 2 == 0) {
					b = true;
				}
			}
			if (b = true) {
				System.out.println(no);
			}
		}
	}
}
