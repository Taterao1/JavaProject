package JavaPractice;

public class DuplicateChar {
	public static void getStringValue(String str) {
		int[] arr = new int[126];

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
		}

		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i]>1)
			{
				 System.out.println((char)i+" repeated "+arr[i]+ "times");
				
			}
		}
		
	}

	public static void main(String[] args) {
		String str = "indiaa";
		DuplicateChar.getStringValue(str);
	}

}
