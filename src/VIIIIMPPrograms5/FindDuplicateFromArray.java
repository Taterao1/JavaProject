package VIIIIMPPrograms5;

import java.util.Arrays;

public class FindDuplicateFromArray {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,1,3,2};
		Arrays.sort(arr);
		
		
		for(int i=0;i<arr.length;i++)
		{
			int flag=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					flag=1;
					//System.out.print(arr[i]+" ");
					
				}
			}
			if(flag==1)
			{
				continue;
			}
			System.out.print(arr[i]+" ");
		}
	}

}
