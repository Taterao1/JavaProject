package practice1;

public class GlobalVariable {
	
	String name="Rajkumar";
	int empid=969679;
	
	public void globalVariable1()
	{
		System.out.println(name);
	}
	
	public void globalVariable2()
	{
		System.out.println(empid);
	}
	
	public static void main(String[]args)
	{
		GlobalVariable ob=new GlobalVariable();
		
		ob.globalVariable1();
		ob.globalVariable2();
	}

}
