package AAAAAAAAAAAAAAA;

public class PrimeNumber1 {
	public static void main(String[] args) {
		int no = 7;

		boolean b = false;

		for (int i = 2; i <= no - 1; i++) {
			if (no % i == 0) {
				b = true;
			}
		}
		if (b == true)
		{
			System.out.println("not prime");
		} 
		else 
		{
			System.out.println("Number  prime");
		}
	}

}
