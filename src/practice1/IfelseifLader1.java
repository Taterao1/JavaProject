package practice1;

public class IfelseifLader1 
{
	
	public void checkMarksMethod()
	{
		int mark=70;
		
		if(mark>=1&&mark<=30)
		{
			System.out.println("fail");
		}
		else if(mark>=40&&mark<=60)
		{
			System.out.println("pass in 3rd class");
		}
		
	}
	public static void main(String[]args)
	{
		IfelseifLader1 ct=new IfelseifLader1();
		ct.checkMarksMethod();
	}
}