package JavaPractice1;

public class ReverseNumber {
	public static void main(String[] args) {
		int no = 9876;
		int temp = no;
		int rev = 0, rem;

		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		System.out.println(rev);

	}
}
