package VIIIIMPPrograms;

public class MinNumber {
	public static void maxNum(int[] arr) {

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}

	public static void minNum(int[] arr) {
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		int arr[] = { 90, 70, 80, 10, 20 };
		MinNumber.maxNum(arr);
		MinNumber.minNum(arr);
	}

}
