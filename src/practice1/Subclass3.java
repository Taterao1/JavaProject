package practice1;

public class Subclass3 extends SuperClass{
	
	public void slee()
	{
		System.out.println("I ma sleeping");
	}
	
	public static void main(String[]args)
	{
		
		Subclass1 c1 =new Subclass1();
		Subclass2 c2=new Subclass2();
		Subclass3 c3=new Subclass3();
		
		c1.car();
		c1.byke();
		c2.home();
		c3.slee();
		
		
	}

}
