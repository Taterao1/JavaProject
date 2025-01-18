package VIIIIMPPrograms1;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        String str = "This is really simple sentence";
        str = str.replaceAll(" ", "");

        char vowel = ' ';
        String consonants = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowel = currentChar;
                System.out.print(vowel);
            } else if (currentChar >= 'a' && currentChar <= 'z') {
                consonants += currentChar;
            }
           
        }

        System.out.println(consonants);
    }
}
