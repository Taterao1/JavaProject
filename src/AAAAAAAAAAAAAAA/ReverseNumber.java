package AAAAAAAAAAAAAAA;

public class ReverseNumber {
	public static void main(String[] args) {
		int no = 1234;
		int rem, temp;
		int rev = 0;
		temp = no;

		while (temp != 0) {

			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;

		}
		System.out.println(rev);

	}
}
