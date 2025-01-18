package JAVAPROGRAMS;

public class BubbleSort2 {

	public static void m1(String[] arr) {
		for (int pass = 0; pass < arr.length; pass++) {
			String temp;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i].compareTo(arr[i + 1]) > 0) {
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
		String[] s = { "banana", "apple", "mango" };
		BubbleSort2.m1(s);

	}

}
