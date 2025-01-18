
package VIIIIMPPrograms1;

public class OccuranceOfOneCharacterFromTheString {
	public static void main(String[] args) {
		String s = "aabbbbcc";
		int a = s.length();// 6
		// System.out.println(a);
		int b = s.replace("b", "").length();// 4
		// System.out.println(b);
		int c = a - b;// 6-4
		System.out.println(c);
	}

}
