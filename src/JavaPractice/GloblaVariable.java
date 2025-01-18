package JavaPractice;

public class GloblaVariable {
	
	String name="Rajkumar";
	int age=35;
	
	public void globalVariable1()
	{
		
		System.out.println("Name: "+name);
	}
	
	public void globalVariable2()
	{
		System.out.println("Age: "+age);
		
	}
	
	public static void main(String[]args)
	{
		
		GloblaVariable obj=new GloblaVariable();
		obj.globalVariable1();
		obj.globalVariable2();
	}
	

}
