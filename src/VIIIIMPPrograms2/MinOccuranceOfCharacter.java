package VIIIIMPPrograms2;

public class MinOccuranceOfCharacter {
	public static void main(String[] args) {
		int[] arr = { 30, 20, 10, 50 };
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

}
