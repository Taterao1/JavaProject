package VIIIIMPPrograms1;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharacter {

	public static void main(String[] args) {

		String str = "india is my country";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				if (map.containsKey(str.charAt(i))) {

					map.put(str.charAt(i), map.get(str.charAt(i)) + 1);

				} else {
					map.put(str.charAt(i), 1);
				}
			}
		}
		System.out.println(map);
	}

}
