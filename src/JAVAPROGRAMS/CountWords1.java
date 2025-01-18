package JAVAPROGRAMS;

import java.util.HashMap;
import java.util.Map;

public class CountWords1 {
	
	public static void wordsCount(String s)
	
	{
		String[] str=s.split(" ");
		
		Map<String, Integer>map=new HashMap<>();
		
		for(int i=0;i<str.length;i++)
		{
			if(map.containsKey(str[i]))
			{
				map.put(str[i], map.get(str[i])+1);
			}
			else
			{
				map.put(str[i], 1);
			}
		}
		System.out.println(map);
	}
	public static void main(String[] args) {
		CountWords1.wordsCount("Amit Ashish Amit");
		
	}

}
