import java.util.Scanner;
public class Factorial{
    public int findFactorial(int n){
        if(n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if(n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return n * findFactorial(n - 1); // Recursive case
    }
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int number = sc.nextInt();
        int result = factorial.findFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}