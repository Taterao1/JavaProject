package VIIIIMPPrograms5;

public class Demo3 {

	public static void main(String[] args) {
		String str = "Trerao";
		str = str.toLowerCase();
		boolean isCheck = false;

		char[] arr = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
					isCheck = true;
				}
			}
			if (isCheck) {
				break;
			}
		}
	}

}
