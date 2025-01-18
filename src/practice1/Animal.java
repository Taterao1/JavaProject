package practice1;

public class Animal {
	
  String color="While";
  	
}

class Dog extends Animal{
	
	String color="Black";
	
	void display()
	{
		System.out.println(super.color);
	}

public static void main(String[]args)
{
	Dog d=new Dog();
	
	d.display();
}

}