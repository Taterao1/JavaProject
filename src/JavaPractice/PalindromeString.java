package JavaPractice;

public class PalindromeString {
	
	public static void palindromeString(String str)
	{
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		
	}
	public static void main(String[] args) {
		String str="Taterao";
		PalindromeString.palindromeString(str);
		
	}

}
