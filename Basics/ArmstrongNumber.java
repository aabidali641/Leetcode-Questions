import java.util.Scanner;

class ArmstrongNumber {
    public static void findArmStrong(int num) {
        int temp = num;
        int digits = 0;
        int lastDigit;
        int sum = 0;

        // Count digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = num;

        // Calculate sum of digits raised to the power 'digits'
        while (temp > 0) {
            lastDigit = temp % 10;
            sum += Math.pow(lastDigit, digits);
            temp /= 10;
        }

       
        if (sum == num) {
            System.out.println(num + " is Armstrong");
        } else {
            System.out.println(num + " is not Armstrong");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check for Armstrong:");
        int num = sc.nextInt();

        findArmStrong(num);  

        sc.close();
    }
}
