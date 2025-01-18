package practice1;

public class MainMethodOverload {
	
	public static void main(String name)
	{
		System.out.println(name);
	}
	public static void main(int age)
	{
		System.out.println(age);
	}
	
	public static void main(String[]args)
	{
		MainMethodOverload ob=new MainMethodOverload();
		
		ob.main("Rajkumar Gaikwad");
		ob.main(35 );
	}

}
