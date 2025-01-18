package JAVAPROGRAMS;

public class Demo1 {
	
	public static void main(String[] args) {
		String str="Taterao Gaikwad";
		str=str.toLowerCase();
		char c='a';
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==c)
			{
				count++;
				
			}
		}
		System.out.println(count);
	}

}
