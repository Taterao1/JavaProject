package VIIIIMPPrograms3;

public class Demo6 {
public static void main(String[] args) {
	String s="Taterao Gaikwad";
	
	String[]str= s.split(" ");
	
	
	for(int i=str.length-1;i>=0;i--)
	{
		for(int j=str[i].length()-1;j>=0;j--)
		{
			System.out.print(str[i].charAt(j));
		}
		System.out.print(" ");
	}
}
}
