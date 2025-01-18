package VIIIIMPPrograms;

public class PAlindromeString1 {
	public static void getData(String str)
	{
		String rev="";
		
		
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
	public static void main(String[] args)
	{
		String str="MADAN";
		PAlindromeString1.getData(str);
	}

}
