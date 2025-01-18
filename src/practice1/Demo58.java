package practice1;

public class Demo58 {
	
	public static void main(String[]args)
	{
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		int even=0;
		int odd=0;
		
		for(int x:a)
		{
			if(x%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("even number are:"+even);
		System.out.println("odd number are:"+odd);
	}

}
