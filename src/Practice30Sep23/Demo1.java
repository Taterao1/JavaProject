package Practice30Sep23;

public class Demo1 {
	public static void main(String[] args) {
		int no = 123456;
		int rem;
		int leng = 0;

		while (no != 0) {
			
			no = no / 10;

			leng = leng + 1;

		}
		System.out.println(leng);

	}

}
