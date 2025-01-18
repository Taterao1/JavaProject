package practice1;

public class ChildClass extends ParentClass{
	
	public void printData()
	{
		System.out.println(super.name);
	}
	
	public static void main(String[]args)
	{
		ChildClass tc=new ChildClass();
		
		tc.printData();
	}
	
	

}
