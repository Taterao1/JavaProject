package practice1;

public class Demo2 {
	
	String name;
	int id;
	double percentage;
	
	Demo2(String name,int id,double percentage)
	{
		this.name=name;
		this.id=id;
		this.percentage=percentage;
		
		System.out.println(name+"|"+id+"|"+percentage);
		
	}
	
	public static void main(String[]args)
	{
		Demo2 d2=new Demo2("Rajkumar",256,97);
	}

}
