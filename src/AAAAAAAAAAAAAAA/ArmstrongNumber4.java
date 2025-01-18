package AAAAAAAAAAAAAAA;

public class ArmstrongNumber4 {

	public static void main(String[] args) {
		int no = 153;
		int temp1 = no;
		int leng = 0;

		while (temp1 != 0) {
			leng = leng + 1;
			temp1 = temp1 / 10;
		}
		
		int rem=0;
		int temp2=no;
		int sum=0;
		
		while(temp2!=0)
		{
			rem=temp2%10;
			temp2=temp2/10;
			int mul=1;
			
			for(int i=1;i<=leng;i++)
			{
				mul=mul*rem;
			}
			sum=sum+mul;
		}
		if(no==sum)
		{
			System.out.println(no+"  is armstrog");
		}
		else
		{
			System.out.println(no+" is not armstrong");
		}
		
		

	}

}
