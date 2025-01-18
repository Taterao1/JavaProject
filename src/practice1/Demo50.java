package practice1;

public class Demo50 {
	
	public static void main(String[]args)
	{
		int a[]= {10,20,30,10,40,10,50,60,20,30,40,50,10,};
		
		int num=30;
		int count=0;
		
		for(int value:a)
		{
			if(value==num)
			{
				count++;
			}
			
		}
		System.out.println(count);
		
	}

}
