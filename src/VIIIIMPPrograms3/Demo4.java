package VIIIIMPPrograms3;

public class Demo4 {
	public static void main(String[] args)
	{

		String str = "Taterao";
		String rev = "";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(str.equals(rev))
		{
			System.out.println(str+" Is palindrome");
		}
		else
		{
			System.out.println(str+" Is not palindrome");
		}
		
		
		

	}
}
