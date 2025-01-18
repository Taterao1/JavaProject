package practice1;

public class Demo56 {
	
	public static void main(String[]args)
	{
		int a[]= {10,15,16,17,18,19,20,22,5,23,27,29,30};
		
		int even=0;
		int odd=0;
		
		for(int value:a)
		{
			if(value%2==0)
			{
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("No of even are:"+even);
		System.out.println("No of odd are:"+odd);
	}

}
