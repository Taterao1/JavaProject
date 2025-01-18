package practice1;

public class SingleInheritance3 extends SingleInheritance2
{
   public void m4()
   {
	   
	   String name="Mumbai";
	   String name1="Pune";
	   System.out.println(name);
	   System.out.println(name1);
   }
   
   public static void main(String[]args)
   {
	   SingleInheritance3 ob1=new SingleInheritance3();
	   
	   ob1.m3();
	   ob1.m4();
   }
}
