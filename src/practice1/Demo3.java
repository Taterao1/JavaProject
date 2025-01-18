package practice1;

public class Demo3 {
	
	String name;
	int id;
	double percentage;
	
	Demo3(String name,int id,double percentage)
	{
		this.name=name;
		this.id=id;
		this.percentage=percentage;
		
		System.out.println(name+"|"+id+"|"+98.5);
	}
	
	public static void main(String[]args)
	{
		Demo3 d3=new Demo3("Rajkumar",322,97);
	}

}
