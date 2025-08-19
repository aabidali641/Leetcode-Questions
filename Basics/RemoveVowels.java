public class RemoveVowels {
    public static String removeVowels(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String must not be null or empty");
        }

        StringBuilder result = new StringBuilder();
        str = str.toLowerCase(); // optional: uniform check

        for (char ch : str.toCharArray()) {
            if ("aeiou".indexOf(ch) == -1) { // agar vowel nahi hai
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Hello World";
        String output = removeVowels(input);
        System.out.println("Original: " + input);
        System.out.println("Without Vowels: " + output);
    }
}
