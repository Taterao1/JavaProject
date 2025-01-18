package StringPrograms1;

public class CountString {
	
	public static void main(String[] args) {
		boolean b=false;
		int count=0;
		String str="Tatero Gaikwad Automation Engineer";
		
		// Iterate through each character in the string
		for(int i=0; i<str.length(); i++) {
			// Check if the current character is a space
			if(str.charAt(i)==' ') {
				b=false;
			} else {
				// If the current character is not a space and the previous one was a space, it indicates the start of a new word
				if(b==false) {
					b=true;
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
