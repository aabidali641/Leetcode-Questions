import java.util.Scanner;

public class HCFCalculator {

    //  Function to find HCF using Euclidean Algorithm
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int hcf = findHCF(a, b);

        System.out.println("HCF of " + a + " and " + b + " is: " + hcf);

        sc.close();
    }
}
