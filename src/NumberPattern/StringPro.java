package NumberPattern;

public class StringPro {
	public static void main(String[] args) {
		String str="My name is pooja";
		
		String[] str1=str.split(" ");//["My","name","is","Pooja"]
		
		for(int i=0;i<=str1.length-1;i++)//My
		{
			String strr=str1[i];//My
		
			if(strr.equals("is"))
			{
				for(int j=strr.length()-1;j>=0;j--)
				{
					System.out.print(strr.charAt(j));
					
				}
				break;
				//System.out.print(" ");
			}
			
			
		}
		
			
		
	}

}

