package practice1;

class D{
	
	void m1()
	{
		System.out.println("this is m1 method");
	}
}

class E extends D{
	
	
	void m2() {
		
		System.out.println("this is m2 method");
	}
}

public class Inheritance {
	
	public static void main(String[]args)
	{
		E ob= new E();
		
		ob.m1();
		ob.m2();
	}
	

}
