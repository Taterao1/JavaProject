package JavaPractice;

public class InstanceVariable {

	String name;
	int id;
	
		
		public InstanceVariable(String name,int id)
		{
			
			this.name=name;
			this.id=id;
			
			System.out.println(name+"|"+id);
		}
		
		public static void main(String[]args)
		{
			InstanceVariable obj=new InstanceVariable("rajkumar",45);
			
		}
		

	}


