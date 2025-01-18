package VIIIIMPPrograms2;

public class BubbleSort2 {

	public static void getValues(int[] arr) {

		for (int pass = 0; pass < arr.length; pass++) {
			int temp;

			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;

				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}

	}

	public static void main(String[] args) {
		int[] a = { 80, 70, 40, 30, 20, };
		BubbleSort2.getValues(a);

	}

}
