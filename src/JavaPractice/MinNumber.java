package JavaPractice;

public class MinNumber {
	public static void minNum(int a[])
	{
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
		
	}
	public static void main(String[] args) {
		
		int a[]= {30,20,40,10};
		MinNumber.minNum(a);
		
		
		
	}

}
