package VIIIIMPPrograms2;

public class BubbleSort3 {
	public static void getValues(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int temp;
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

	public static void main(String[] args) {
		int arr[] = { 40, 30, 10, 20 };
		BubbleSort3.getValues(arr);
	}

}
