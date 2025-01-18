package Practice30Sep23;

public class PrimeNumber2 {

	public static void main(String[] args) {
		int sum=0;
		for(int no=2;no<=100;no++)
		{
			boolean b=false;
			for(int i=2;i<no-1;i++)
			{
				if(no%i==0)
				{
					b=true;
				}
			}
		
			if(b==false)
			{
				System.out.println(no);
				//sum=sum+no;
		}
			
		}
		//System.out.println(sum);
		

	}

}
