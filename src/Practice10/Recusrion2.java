package Practice10;

public class Recusrion2 {

	static int a = 0;
	static int b = 1;
	static int temp;

	public static void main(String[] args) {

		int num = 8;
		fibb(num);

	}

	public static void fibb(int no) {
		if (no > 0) {
			temp = a + b;
			System.out.println(temp);
			a = b;
			b = temp;
			fibb(no - 1);

		}
	}

}
