
import java.util.Scanner;

public class OddEven {
    public void findOddEven(int n){
        if(n % 2 == 0){
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is ODD");
        }
    }
    public static void main(String[] args) {
        OddEven oe = new OddEven();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        sc.close();
        oe.findOddEven(n);
    }
}