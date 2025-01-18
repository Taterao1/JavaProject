package JavaPractice1;

public class FabannaciSeries {
	public static void main(String[] args) {
		int no1 = 0, no2 = 1;
		int c;
		for (int i = 1; i <= 5; i++) {
			c = no1 + no2;
			System.out.println(c);
			no1 = no2;
			no2 = c;
		}

	}
}
