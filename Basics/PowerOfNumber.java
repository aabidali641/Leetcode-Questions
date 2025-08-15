import java.util.Scanner;
public class PowerOfNumber{
    public double findPower(double base , int exponent){
        if(exponent < 0) {
            throw new IllegalArgumentException("Exponent must be non-negative");
        }
        if(exponent == 0) {
            return 1; // Base case: any number to the power of 0 is 1
        }
        return base * findPower(base, exponent - 1); // Recursive case
    }
    public static void main(String[] args) {
        PowerOfNumber powerOfNumber = new PowerOfNumber();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base = sc.nextDouble();
        System.out.print("Enter the exponent (non-negative integer): ");
        int exponent = sc.nextInt();
        double result = powerOfNumber.findPower(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}