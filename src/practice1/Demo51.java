package practice1;

public class Demo51 {
	
	public static void main(String[]args)
	{
		int a[] ={10,20,10,30,20,30,10,30,20,10,20,30,};
		
		int num=10;
		int count=0;
		
		for(int value:a)
		{
			if(value==num)
			{
				count++;
			}
		}
		System.out.println("Number of repeated is:"+count);
	}

}
