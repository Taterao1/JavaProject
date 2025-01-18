package practice1;

public class Testclass {
	
	// call this keyword
	
	private String name;
	private int age;
	
	private String company;
	private int empid;
	
	Testclass()
	{
		this("Rajkumar",35);
	}
	
	Testclass(String name,int age)
	{
		this(3636,"TechMahindra");
		
		this.name=name;
		this.age=age;
		System.out.println(name+"|"+age);
		
	}
	Testclass(int empid,String company)
	{
		this.company=company;
		this.empid=empid;
		
		System.out.println(company+"|"+empid);
	}
	public static void main(String[]args)
	{
		Testclass tc=new Testclass();
		
	}
	

}
