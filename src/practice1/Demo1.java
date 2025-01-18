package practice1;

public class Demo1 {
	
	String name;
	int id;
	
	Demo1(String name,int id)
	{
		this.name=name;
		this.id=id;
		
		System.out.println(name+"|"+id);
	}
	
	public static void main(String[]args)
	{
		Demo1 d=new Demo1("Rajkumar",345);
		
		
	}

}
