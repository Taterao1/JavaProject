package Practice30Sep23;

public class CountDigit {
	public static void main(String[] args) {
		int no=12345;
		int temp=no;
		int leng=0;
		
		while(temp!=0)
		{
			leng=leng+1;
			temp=temp/10;
		}
		System.out.println(leng);
	}

}
