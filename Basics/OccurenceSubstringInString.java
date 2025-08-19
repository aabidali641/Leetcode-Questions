public class OccurenceSubstringInString {
    public static void main(String[] args) {
        String str = "Hello, world! Hello, everyone!";
        String subStr = "Hello";
        
        int count = countOccurrences(str, subStr);
        System.out.println("The substring '" + subStr + "' occurs " + count + " times in the string.");
    }

    public static int countOccurrences(String str, String subStr) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); // Move past the last found occurrence
        }

        return count;
    }
}