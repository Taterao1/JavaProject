package StarPatternOct2023;

public class Demo4 {
	public static void main(String[] args) {
		int no1 = 0;
		int no2 = 1;

		for (int i = 0; i < 5; i++) {
			int c = no1 + no2;
			System.out.println(c);
			no1 = no2;
			no2 = c;

		}
	}

}
