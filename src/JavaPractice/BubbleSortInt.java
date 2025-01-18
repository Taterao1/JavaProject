package JavaPractice;

public class BubbleSortInt {
	
	public static void getData(int a[])
	{
		for(int pass=0;pass<=a.length;pass++)
		{
			int temp;
			for(int i=0;i<a.length-1;i++)
			{
				if(a[i]>a[i+1])
				{
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
				
			}
		}
		System.out.println("List of arraylist");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

	public static void main(String[] args) {
		
		int a[]= {20,10,40,30};
		
		BubbleSortInt.getData(a);
	}

}
