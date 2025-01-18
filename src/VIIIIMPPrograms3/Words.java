package VIIIIMPPrograms3;

import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class Words {
	public static void main(String[] args) {
		String s = "The Mother The";

		String[] str = s.split(" ");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < str.length; i++) {
			if (map.containsKey(str[i])) {
				map.put(str[i], map.get(str[i]) + 1);
			} else {
				map.put(str[i], 1);
			}
		}
		System.out.println(map);

	}

}
