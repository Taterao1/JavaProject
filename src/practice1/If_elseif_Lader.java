package practice1;

public class If_elseif_Lader {
	
	public void checkMarks() {
		
		int marks=65;
		
		if(marks>=1&&marks<=35)
		{
			System.out.println("Fail");
		}
		else if(marks>=40&&marks<=60)
		{
			System.out.println("Pass in 3rd class");
		}
		else if(marks>=60&&marks<=80)
		{
			System.out.println("Pass in 2nd class");
		}
		else if(marks>=80&&marks<=100)
		{
			System.out.println("Pass in 1st class");
		}
		}
	public static void main(String[]args)
	{
		If_elseif_Lader ck=new If_elseif_Lader();
		
		ck.checkMarks();
	}
	

}
