package VIIIIMPPrograms;

public class BubbleSorting {
	public static void getData(int[] arr) {
		for (int round = 0; round < arr.length; round++) {
			int temp;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}

			}

		}
		System.out.println("Array list are");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {
		int a[] = { 20, 10, 40, 30, 50 };
		BubbleSorting.getData(a);
	}

}
