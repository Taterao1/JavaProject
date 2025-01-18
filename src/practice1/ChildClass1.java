package practice1;

public class ChildClass1 extends ParentClass1{
	
	public void printData()
	{
		
		super.method();
		
	}
	public static void main(String[] args) {
		
		ChildClass1 c2=new ChildClass1();
		
		c2.printData();
	}

}
