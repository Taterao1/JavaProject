package JavaPractice;

public class Demo13 {

	public static void getData(String[] a) {
		for (int pass = 0; pass <= a.length; pass++) {
			String temp;

			for (int i = 0; i < a.length - 1; i++) {
			//	if (a[i].compareTo(a[i + 1])>0)
				if(a[i].compareTo(a[i+1])>0)
				{
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
		}
		System.out.println("List of array");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}
	public static void main(String[] args) {
		String[] str= {"Mango","Apple","Banana"};
		Demo13.getData(str);
	}

}
