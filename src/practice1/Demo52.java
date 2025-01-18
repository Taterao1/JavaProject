package practice1;

public class Demo52 {
	
	public static void main(String[]args)
	{
		int a[]= {10,20,10,20,10,20,10,20,10,20,10,20,20};
		
		int num=20;
		int count=0;
		
		for(int value:a)
		{
			if(value==num)
			{
				count++;
			}
		}
		System.out.println("No of repeated are:"+count);
	}

}
