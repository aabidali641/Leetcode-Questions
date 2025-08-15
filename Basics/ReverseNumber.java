import java.util.Scanner;
public class ReverseNumber{
    public int reverse(int n) {
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        ReverseNumber reverseNumber = new ReverseNumber();
        System.out.println("Enter a number to reverse:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reversed = reverseNumber.reverse(n);
        System.out.println("Reversed number is: " + reversed);
        sc.close();
    }
}