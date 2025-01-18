package StarPatternOct2023;

public class Demo3 {
	public static void main(String[] args)
	{
		int no=121;
		int temp=no;
		int rem=0;
		int rev=0;
		
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		if(no==rev)
		{
			System.out.println(no + " Is palindrome");
		}
		else
		{
			System.out.println(no+ " Is not palindrome");
		}
	}

}
