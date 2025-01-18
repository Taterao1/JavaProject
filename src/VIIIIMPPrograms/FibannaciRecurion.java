package VIIIIMPPrograms;

public class FibannaciRecurion {
	static int a=0;
	static int b=1;
	static int temp=0;
	
	public static void main(String[] args) {
 
		int num=8;
		fib(num);
	
	}
 
	public static void fib(int num)
	{
		if(num>0)
		{
			temp=a+b;
			System.out.print(temp);
			a=b;
			b=temp;
			
			fib(num-1);
		}
	}

}
