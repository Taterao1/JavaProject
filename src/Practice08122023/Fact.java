package Practice08122023;

public class Fact {
	static int fact = 1;

	public static void main(String[] args) {
		int no = 5;
		Fact obj = new Fact();
		int factNo = obj.calFact(no);
		System.out.println(factNo);

	}

	public int calFact(int no)
	{

		if (no >= 1) {

			fact = fact * no;
			no = no - 1;
			calFact(no);

		}
		return fact;
	}

}
