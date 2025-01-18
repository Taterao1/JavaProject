package practice1;

public class ParameterizedConstructor1 {
	
	private String name;
	private int id;
	
	ParameterizedConstructor1(String name,int id)
	{
		
		this.name=name;
		this.id=id;
		
		
	}
	public static void main(String[]args)
	{
		ParameterizedConstructor1 ob=new ParameterizedConstructor1("Rajkumar",35);
		ParameterizedConstructor1 ob1=new ParameterizedConstructor1("Anuradha",25);
		
		System.out.println("Name:"+ob.name+"|"+"Age:"+ob.id);
        System.out.println("Name:"+ob1.name+"|"+"Age"+ob1.id);		
	}

}
