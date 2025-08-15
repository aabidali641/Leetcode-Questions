import java.util.Scanner;

public class numberOfDigits{
    public int countDigits(int n){
        int digits = 0;
        while(n > 0){
            int digit = n% 10;
            digits++;
            n /= 10;
        }
        return digits;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number to count its digits:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        numberOfDigits numDigits = new numberOfDigits();
        int count = numDigits.countDigits(n);
        System.out.println("Number of digits in " + n + " is: " + count);
        sc.close();
    }
}