package practice1;

public class OverLoading {
	
	public int add(int a,int b)
	{
		return a+b;
		
	}
	public double add(double a,double b)
	{
		return a+b;
		
		
	}
	public String add(String a,String b)
	{
		return a+b;
	}
	public static void main(String[]args)
	{
		OverLoading ov=new OverLoading();
		
		System.out.println(ov.add(25.32, 203.26));
		System.out.println(ov.add(10, 32));
		System.err.println(ov.add("Rajkumar"+" ", "Gaikwad"));
	}

}
