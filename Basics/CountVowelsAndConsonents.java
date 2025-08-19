public class CountVowelsAndConsonents{
    public static void countVowelsAndConsonants(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String must not be null or empty");
        }
        
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        String input = "Hello World";
        countVowelsAndConsonants(input);
    }

}