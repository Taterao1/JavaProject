package VIIIIMPPrograms3;

public class Demo1 {
	public static void main(String[] args) {
		String str="Taterao Gaikwad";
		String[] s=str.split(" ");
		
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
		}
	}

}
