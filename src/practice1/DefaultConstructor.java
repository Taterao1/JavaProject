package practice1;

public class DefaultConstructor {
	
	private String name;
	private int age;
	
	public DefaultConstructor()
	{
	name="Rajkumar Gaikwad";
	age=35;
	
	System.out.println("Name is:"+name+"|"+"Age is:"+age);
		
	}
	public static void main(String[]args)
	{
		
		DefaultConstructor df=new DefaultConstructor();
	}

}
