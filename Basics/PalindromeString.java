import java.util.Scanner;
public class PalindromeString{

    public static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length() - 1;
        if(str == null || str.isEmpty()){
            throw new IllegalArgumentException("String must not be null or empty");
        }
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        PalindromeString ps = new PalindromeString();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        sc.close();
        boolean result = ps.isPalindrome(input);
        if(result){
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is not a Palindrome");
        }
    }
}