package Practice08122023;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int no = 152;
		int leng = 0;
		int temp1 = no;

		while (temp1 != 0)// get individual number
		{
			temp1 = temp1 / 10;
			leng = leng + 1;

		}
		int temp2 = no;
		int rem;
		int sum = 0;

		while (temp2 != 0) {
			rem = temp2 % 10;
			// System.out.println(rem);
			temp2 = temp2 / 10;
			int mul = 1;
			for (int i = 1; i <= leng; i++) {
				mul = mul * rem;

			}

			sum = sum + mul;
		}
		// System.out.println(sum);

		if (sum == no) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("Is not Armstrong number");

		}

	}

}
