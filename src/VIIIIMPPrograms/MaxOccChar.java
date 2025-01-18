package VIIIIMPPrograms;

public class MaxOccChar {

	public static void getString(String str) {
		
		int[]arr=new int[126];
		
		for(int i=0;i<str.length();i++)
		{
			arr[str.charAt(i)]=arr[str.charAt(i)]+1;
			
		}
		
		int max=-1;
		
		char c= ' ';
		
		for(int i=0;i<str.length();i++)
		{
			if(max<arr[str.charAt(i)])
			{
				max=arr[str.charAt(i)];
				c=str.charAt(i);
			}
		}
		System.out.println("Maximum Repeated value is "+c);

	}

	public static void main(String[] args) {
		String str = "aabbccccddd";
		MaxOccChar.getString(str);
	}

}
