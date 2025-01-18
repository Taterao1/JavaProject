package StarPatternOct2023;

public class Demo5 {
	int fact = 1;

	public static void main(String[] args) {
		int no = 5;

		Demo5 obj = new Demo5();
		int aa = obj.calFact(no);
		System.out.println(aa);

	}

	public int calFact(int no) {
		if (no >= 1) {
			fact = fact * no;
			no = no - 1;
			calFact(no);

		}

		return fact;
	}
}
