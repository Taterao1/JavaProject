package JAVAPROGRAMS;

public class MAximumOccuranceOfCharacterSingle {
	
	    public static void main(String[] args) {
	        String str = "aabccccddeee";
	        char targetChar = 'a';

	        int[] arr = new int[128];

	        for (int i = 0; i < str.length(); i++) {
	            arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
	        }

	        int maxOccurrence = 0;

	        for (int i = 0; i < arr.length; i++) {
	            if (str.charAt(i) == targetChar && arr[i] > maxOccurrence) {
	                maxOccurrence = arr[i];
	            }
	        }

	        System.out.println("Maximum occurrence of '" + targetChar + "' in the string is: " + maxOccurrence);
	    }
	}



