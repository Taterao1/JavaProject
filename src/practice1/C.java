package practice1;

public class C extends B{
	
	public void sleep()
	{
		System.out.println("I am sleeping");
	}
	
	public void play()
	{
		System.out.println("I am plyaing football");
	}
	
	public static void main(String[]args)
	{
		C ob3=new C();
		ob3.crecket();
		ob3.swim();
		ob3.run();
		ob3.sleep();
		ob3.play();
	}

}
