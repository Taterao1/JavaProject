package VIIIIMPPrograms1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class OccuranceOfWOrds {
	
	public static void main(String[] args) {
		String a="The";
		String b="The Mother";
		String c=a+" "+b;
		String[] d=c.split(" ");//index 0=The, 1=The,2=Mother;
		//System.out.println(c);
		
		Map<String,Integer> map=new TreeMap<>();
		
		for(int i=0;i<d.length;i++)
		{
			if(map.containsKey(d[i]))
			{
				map.put(d[i], map.get(d[i])+1);
				
			}
			else
			{
				map.put(d[i], 1);// The=1;
			}
		}
		System.out.println(map);
	}

}
