package practice1;

public class StaticVariable {
	
	static String name="Rajkumar Gaikwad";
	
	static void nonStaticMethod()
	{
		System.out.println(name);
	}
	public void staticMethod()
	{
		System.out.println(name);
	}
	
	public static void main(String[]args)
	{
		StaticVariable st=new StaticVariable();
		
		st.nonStaticMethod();
		st.staticMethod();
		
		
	}

}
