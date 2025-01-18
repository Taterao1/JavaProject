package practice1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
	
	public static void main(String[]args)
	{
		HashSet myset=new HashSet();
		
		myset.add(100);
		myset.add(200);
		myset.add('A');
		myset.add("welcome");
		myset.add(true);
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		System.out.println(myset);
		
		myset.remove(200);
		System.out.println(myset);
		
		ArrayList al= new ArrayList(myset);
		
		//System.out.println(al);
		//System.out.println((al.get(3));
	     
		Iterator<Object>it=myset.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
			System.out.println(myset.size());
		}
		
		
	}

}
