package JavaPractice1;

import java.util.HashSet;

public class Demo4 {
	public static void main(String[] args) {
		Demo4 rm= new Demo4();
		
	//	rm.sortedInt();
	//	System.out.println("next");
	//	rm.unsortedInt();
		//System.out.println("next");
		rm.strings();
	}
	
	public void sortedInt()
	{
		int[] ar= {2,3,3,4,5,5,5,6,6,7,7,8,8,9,9,9,9};
		
		HashSet<Integer> hs= new HashSet();
		
		for(int i=0;i<=ar.length-1;i++)
		{
			hs.add(ar[i]);
		}
		for(int a : hs)
		{
			System.out.print(a + " ");
			
		}
		
	}
	
	public void unsortedInt()
	{
		int[] arr= {12,3,43,55,66,55,77,33,11,88,11,99,11,99};
		
		HashSet<Integer> hs1= new HashSet();
		
		for(int i=0;i<=arr.length-1;++i)
		{
			hs1.add(arr[i]);
		}
		for(int b:hs1)
		{
			System.out.print(b + " ");
		}
	}
	
	public void strings()
	{
		String str= "aksncndbdbdbdbtgsnmaksjhd";
		char[] strr= str.toCharArray();
		
	//	System.out.println(strr);
		
		HashSet<Character> hs2 = new HashSet();
		
		for(int i=0;i<=strr.length-1;++i)
		{
			hs2.add(strr[i]);
		}
		
		for(char s:hs2)
		{
			System.out.print(s + " ");
		}
		
	}


}
