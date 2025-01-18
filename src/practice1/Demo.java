package practice1;

public class Demo {
	
	String name;
	int id;
	
	Demo(String name,int id)
	{
		this.name=name;
		this.id=id;
		
		System.out.println(name+"|"+id);
	}
	
	public static void main(String[]args)
	{
		Demo d1=new Demo("Rajkumar",255);
	}

}
