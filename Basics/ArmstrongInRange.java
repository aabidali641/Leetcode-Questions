
import java.util.Scanner;

public class ArmstrongInRange {
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int digits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number of the range:");
        int start = sc.nextInt();
        System.out.println("Enter the second number of the range:");
        int end = sc.nextInt();
        sc.close();

        System.out.print("Armstrong numbers between " + start + " and " + end + ": ");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
