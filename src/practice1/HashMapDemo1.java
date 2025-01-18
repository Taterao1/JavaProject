package practice1;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo1 {
	
	public static void main(String[]args)
	{
	   Map mymap=new HashMap();
	   
	   HashMap<Integer,String> hm=new HashMap<Integer,String>();
	   
	   // adding pairs
	   
	   hm.put(101, "John");
	   hm.put(102, "Scott");
	   hm.put(103, "Mary");
	   hm.put(104, "David");
	   hm.put(105, "Scott");
	   
	   System.out.println(hm);
	   
	   // size of hashmap
	   System.out.println("Size of HashMap:"+hm.size());
	   
	   hm.remove(103);
	   System.out.println(hm);
	   
	   hm.get(103);
	   System.out.println(hm.get(105));
	   // get all the keys from hashmap
	   System.out.println(hm.keySet());
	   // get all the values
	   System.out.println(hm.values());
	   // get key+values
	   System.out.println(hm.entrySet());
	   //by using for loop
	   
	   for(int k:hm.keySet())
	   {
		   System.out.println(k+" "+hm.get(k));
		   
		   
	   }
	   // using iterator
	   
	  // Iterator<Entry> it =hm.entrySet().iterator();
	   
	   
	}

}
