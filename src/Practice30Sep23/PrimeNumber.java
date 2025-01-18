package Practice30Sep23;

public class PrimeNumber {

	public static void main(String[] args) {
		int no=7;// 1 and 7
		
		//1,2,3,4,5,6,7
		boolean b=false;
	
		for(int i=2;i<=no-1;i++)
		{
			if(no%i==0)
			{
				b=true;
			}
		}
		if(b==true)
		{
			System.out.println("Not prime number");
		}
		else
		{
			System.out.println("It is prime number");
		}
		

	}

}
