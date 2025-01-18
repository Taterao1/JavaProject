package JavaPractice;

public class Demo1 {
	static int fact = 1;

	public static void main(String[] args) {
		int no = 5;
		Demo1 obj = new Demo1();
		obj.calcFact(no);
		System.out.println(fact);
	}

	public void calcFact(int a) {
		
		if (a >= 1) {
			fact = a * fact;
			a = a - 1;
			calcFact(a);
		}

	}
}
