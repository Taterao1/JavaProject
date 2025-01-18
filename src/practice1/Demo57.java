package practice1;

public class Demo57 {
	
	public static void main(String[]args)
	{
		int b[]= {10,12,13,14,15,16,17,18,19,20};
		
		int even=0;
		int odd=0;
		
		for(int value:b)
		{
			if(value%2==0)
			{
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("number of even:"+even);
		System.out.println("number of odd:"+odd);
	}

}
