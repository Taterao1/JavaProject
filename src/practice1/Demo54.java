package practice1;

public class Demo54 {
	public static void main(String[]args)
	{
		int a[]= {10,20,10,20,30,30,30,40,50,40,30,};
		
		int num=40;
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