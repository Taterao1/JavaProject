package AAAAAAAAAAAAAAA;

public class FibSeries {
	static int a = 0;
	static int b = 1;
	static int c;

	public static void main(String[] args) {
		int num = 8;
		FibSeries obj = new FibSeries();
		obj.getData(num);

	}

	public static void getData(int no) {
		if (no > 0) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;

			getData(no - 1);

		}

	}

}
