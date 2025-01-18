package VIIIIMPPrograms4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Demo1 {
	public static void main(String[] args) {
		String str="Pooja";
		
		LinkedHashMap<Character,Integer>map=new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			
			}
			else
			{
				map.put(c, 1);
			}
		}
		Set<Entry<Character,Integer>>data=map.entrySet();
		
		for(Entry<Character,Integer>abc:data)
		{
			Character key=abc.getKey();
			Integer value=abc.getValue();
			
			System.out.println(key+" "+value);
		}
	}

}
