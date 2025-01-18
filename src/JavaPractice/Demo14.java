package JavaPractice;

public class Demo14 {
	
	public void localVariable()
	{
		
		String name="Rajkumar";
		System.out.println("Name: "+name);
	}
	
	public void localVariable1()
	{
		
		String sirname="Gaikwad";
		System.out.println("SirName: "+sirname);
	}
	
	public void localVariable2()
	{
		
		String address="Navi Mumbai";
		
		System.out.println("Address:"+address);
	}
	
	public static void main(String[]args)
	{
		
		Demo14 obj=new Demo14();
		
		obj.localVariable();
		obj.localVariable1();
		obj.localVariable2();
	}

}
