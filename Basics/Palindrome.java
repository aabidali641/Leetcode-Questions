import java.util.Scanner;

class Palindrome {
    public int reverseNumber(int num){
        int result = 0;
        while(num > 0){
            int lastDigit = num % 10;
            result = (result * 10) + lastDigit;
            num /= 10;
        } 
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Number: ");
        int num = sc.nextInt();

        Palindrome p = new Palindrome();
        int reversed = p.reverseNumber(num);

        if(reversed == num){
            System.out.println(num + " Is A Palindrome Number ");
        } else {
            System.out.println( num + " Is Not A Palindrome Number ");
        }
    }
}
