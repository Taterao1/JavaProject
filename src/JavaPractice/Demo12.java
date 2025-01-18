package JavaPractice;

public class Demo12 {
	public static void main(String[] args) {
		int no=1234567;
		
		int leng=0;
		
		while(no!=0)
		{
			no=no/10;
			leng=leng+1;
		}
		System.out.println(leng);
	}

}
