package Practice08122023;

public class FabannaciSeries {
	public static void main(String[] args)
	{
		int no1=0;
		int no2=1;
		System.out.print(no1+" "+no2+" ");
		for(int i=0;i<=5;i++)
		{
		
		int c=no1+no2;
		System.out.print(c+" ");
		
		no1=no2;
		no2=c;
		
		
	}
	}
}
