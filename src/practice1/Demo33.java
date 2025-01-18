package practice1;

public class Demo33 {
	
	public static void main(String[]args)
	{
		int up=0;
		int low=0;
		
		String s="RAJKUMAR";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z'&&s.charAt(i)!=' ')
					{
				          up++;
					}
			if(s.charAt(i)>='a'&&s.charAt(i)<='z'&&s.charAt(i)!=' ')
			{
				low++;
			}
		}
		System.out.println(up);
		System.out.println(low);
	}

}
