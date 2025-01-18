package VIIIIMPPrograms4;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfWords {
	public static void main(String[] args) {
		String a = "The";
		String b = "The mother";

		String c = a + " " + b;
		String[] d = c.split(" ");

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < d.length; i++) {
			if (map.containsKey(d[i])) {
				map.put(d[i], map.get(d[i]) + 1);
			} else {
				map.put(d[i], 1);
			}
		}
		System.out.println(map);

	}
}
