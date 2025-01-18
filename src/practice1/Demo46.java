package practice1;

import java.util.Scanner;

public class Demo46 {
	
	public static void main(String[]args) {
	
	int a[]={10,20,30,40,50,60};
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter search no");
		
		int num=sc.nextInt();
		
		boolean status =false;
		for(int i=0;i<=a.length-1;i++)
		{
			if(num==a[i])
			{
				System.out.println("Element found");
				status=true;
				break;
			}
		}
		if(status==false)
		{
			System.out.println("Element not found");
		}
	}

}
}