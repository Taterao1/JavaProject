package StarPatternOct2023;

public class Demo7 {
	public static void main(String[] args) {
		int sum = 0;

		for (int no = 2; no <= 100; no++) {
			boolean b = false;
			for (int i = 2; i < no / 2; i++) {
				if (no % i == 0) {
					b = true;

				}
			}
			if (b == false) {
				// System.out.print(no+" ");
				sum = sum + no;
			}

		}
		System.out.println(sum);

	}
}
