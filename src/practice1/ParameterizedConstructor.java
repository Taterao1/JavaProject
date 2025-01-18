package practice1;

public class ParameterizedConstructor {
	
	private String name;
	private int id;
	
	
	 ParameterizedConstructor(String name,int id)
	{
		this.name=name;
		this.id=id;
		
		
		
	}
	public static void main(String[]args) 
	{
		ParameterizedConstructor pc=new ParameterizedConstructor("Rajkumar",35);
		ParameterizedConstructor pc1=new ParameterizedConstructor("Anuradha",25);
		
		System.out.println(pc.name+"|"+pc.id);
		System.out.println(pc1.name+"|"+pc1.id);
		
	}
}
