package JavaPractice;

public class Demo11 {

	public static void sorgAlgo(int[] a) {

		for (int pass = 0; pass < a.length; pass++) {
			int temp;

			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}

			}

		}
		System.out.println("Final lsit is");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

	public static void main(String[] args) {
		int a[] = { 30, 10, 20, 50, 40 };

		Demo11.sorgAlgo(a);

	}

}
