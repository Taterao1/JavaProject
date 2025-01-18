package JavaPractice1;

public class Demo2 {
	static int fact=1;
	
public static void main(String[] args) {
	int no=5;
	Demo2 obj=new Demo2();
	obj.fact(fact);
	System.out.println(fact);
	
	
}
public void fact(int a)
{
	if(a>1)
	{
		fact=fact*a;
		fact(a-1);
	}
	
}
}
