package practice1;

public class NestedIf {
	
	public static void main(String[]args)
	{
		int age=17;
		int weight=50;
		
		if(age>=18)
		{
			if(weight>50)
			{
				System.out.println("You are Eligible to blood donate");
			}
			else {
				System.out.println("You are not Eligible to blood donate");
			}
		}
			else {
				System.out.println("Age should be greater than 18");
			}
		}
	}


