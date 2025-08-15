import java.util.Scanner;
public class SumOfDigits{
    int sum =0;
    public int totalSum(int n){
        while(n > 0){
        int digit = n % 10;
        sum += digit;
        n /= 10;
    }
    return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number to find the sum of its digits:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SumOfDigits sumOfDigits = new SumOfDigits();
        int total = sumOfDigits.totalSum(n);
        System.out.println("Sum of digits in " + n + " is: " + total);
        sc.close();
    }
}