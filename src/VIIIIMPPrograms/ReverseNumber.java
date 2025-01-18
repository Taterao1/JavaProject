package VIIIIMPPrograms;

public class ReverseNumber {

	public static void reverseNum(int no) {
		int rev = 0;
		int temp, rem;
		temp = no;

		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		int a = 12345;
		ReverseNumber.reverseNum(a);
	}

}
