package practice1;

public class Child extends Parent{
	
	Child(String name,int age)
	{
		super(name,age);
		
		System.out.println(name+"|"+age);
	}
	
	public static void main(String[]args)
	{
		
		Child c=new Child("Rajkumar",35);
	}
	
	

}
