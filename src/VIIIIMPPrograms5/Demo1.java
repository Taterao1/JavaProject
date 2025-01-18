package VIIIIMPPrograms5;

public class Demo1 {
	public static void main(String[] args) {
		
		int a[]= {1,2,2,3,4,5,5};
		
		for(int i=0;i<a.length;i++)
		{
			int flag=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					flag=1;
				}
			}
			if(flag==1)
			{
				continue;
			}
			System.out.print(a[i]+" ");
		}
	}

}
