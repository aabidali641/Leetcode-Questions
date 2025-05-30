import java.util.Scanner;

public class LCMCalculator {

   
    public static int findLCM(int a, int b) {
        int max = Math.max(a, b); 

        
        while (true) {
            if (max % a == 0 && max % b == 0) {
                return max; 
            }
            max++;
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int lcm = findLCM(a, b);

        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);

        sc.close();
    }
}
