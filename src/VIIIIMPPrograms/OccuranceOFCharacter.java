package VIIIIMPPrograms;

public class OccuranceOFCharacter {
	public static void main(String[] args) {
		String str = "Taterao";

		int a = str.length();
		int b = str.replace("a", "").length();
		int c = a - b;
		System.out.println(c);
	}

}
