package JAVAPROGRAMS;

public class BubbleSort1 {

	public static void bubbleSort(int arr[]) {
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
		for (int i = 0; i < arr.length - 1; i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int a[] = { 10, 30, 20, 50, 40 };
		BubbleSort1.bubbleSort(a);

	}

}
