package practice1;

   public class GlobalVariable1 {
	
	public String name="Rajkumar";
	public int id=399;
	public double percentage=98.89;



   public void globalVariable3()
   { 
	System.out.println("Name is:"+name);
	
	}
   public void GlobalVariable4()
   {
	   System.out.println("Id is:"+id);
   }
   
   public void globalVariable5()
   {
	   System.out.println("Percentage are:"+percentage);
   }
   public static void main(String[]args)
   {
	   GlobalVariable1 g=new GlobalVariable1();
	   
	   g.globalVariable3();
	   g.GlobalVariable4();
	   g.globalVariable5();
	   
   }
}