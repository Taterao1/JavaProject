package JavaPractice1;

public class Demo3 {
	static int fact = 1;

	public static void main(String[] args) {
		int no = 5;
		// Demo3 obj=new Demo3();
		Demo3.fact(no);
		System.out.println(fact);

	}

	public static int fact(int a) {
		if (a > 0) {
			fact = fact * a;
			fact(a - 1);
		}
		return fact;
	}
}
