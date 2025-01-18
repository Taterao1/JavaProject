package VIIIIMPPrograms2;

import java.util.HashMap;
import java.util.Map;

public class Data {

	public static void main(String[] args) {
		String str = "zzzaabb";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		// Displaying character frequencies
		/*
		 * for (Map.Entry<Character, Integer> entry : map.entrySet()) {
		 * System.out.println("Character: " + entry.getKey() + ", Frequency: " +
		 * entry.getValue());
		 */

		System.out.println(map);
	}
}
