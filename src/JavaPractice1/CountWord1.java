package JavaPractice1;

public class CountWord1 {
	public static void main(String[] args) {

		String str = "India is my country";
		int count = 0;
		boolean b=true;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				b=true;
			}
			else if(b==true)
			{
				b=false;
				count++;
			}
		}
		System.out.println(count);
		

	}
}