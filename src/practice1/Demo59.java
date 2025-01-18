package practice1;

class AAA
{
	int a=30;
	void display()
	{
		System.out.println(a);
	}
	}
 class BBB extends A
 {
	 int b=10;
	 void show()
	 {
		 System.out.println(b);
	 }
 }

public class Demo59 {
	
	public static void main(String[]args)
	{
		BBB ob=new BBB();
		ob.show();
		ob.hashCode();
		
		
		 
	}

}
