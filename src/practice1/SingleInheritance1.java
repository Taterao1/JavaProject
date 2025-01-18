package practice1;

public class SingleInheritance1 extends SingleInheritance {
	
	
	public void m2()
	{
		
		System.out.println("this is m2 method");
	}
	
	public static void main(String[]args)
	{
		SingleInheritance1 ob=new SingleInheritance1();
		
		ob.m1();
		ob.m2();
	}

}
