package InterviewPrograms;

public class NumberPattern7 {
	public static void main(String[] args) {
		for(int i=4;i>=1;i--)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
