package VIIIIMPPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacterFromTheString {
	public static void main(String[] args) {
		String str = "taterao";

		char[] abc = str.toCharArray();
		LinkedHashSet hs = new LinkedHashSet();

		for (Object o : abc) {
			hs.add(o);
		}
		

		for (Object xyz : hs) {
			System.out.println(xyz);
		}

	}

}
