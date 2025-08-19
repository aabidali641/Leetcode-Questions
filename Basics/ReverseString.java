import java.util.Scanner;
public class ReverseString {
    public String reverse(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String must not be null or empty");
        }
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String input = sc.nextLine();
        String output = rs.reverse(input);
        System.out.println("Reversed String: " + output);
    }
}
