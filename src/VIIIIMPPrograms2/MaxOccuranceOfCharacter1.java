package VIIIIMPPrograms2;

public class MaxOccuranceOfCharacter1 {
	public static void main(String[] args) {
		int[] arr = { 20, 10, 40, 30 };

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}
	

}
