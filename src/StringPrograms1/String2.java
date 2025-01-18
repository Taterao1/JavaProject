package StringPrograms1;

public class String2 {
	public static void main(String[] args) {
		String str="Automation Testing java with java";
		boolean b=true;
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				b=true;
			}
			else if(b==true)
			{
				b=false;
				count++;
			}
		}
		System.out.println(count);
	}

}
