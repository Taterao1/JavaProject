package practice1;

public class MainMethodParams {
	
	public static void main(String[]args)
	{
		for(String s:args) {
			
			System.out.println(s);
		}
		System.out.println(args.length);

}
}