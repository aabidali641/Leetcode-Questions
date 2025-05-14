import java.util.Scanner;

class Palindrome {
    public boolean isPalindrome(int x) {
        int temp = x;
        int ans = 0;
        int lastDigit;

        while (x > 0) {
            lastDigit = x % 10;
            ans = (ans * 10) + lastDigit;
            x /= 10;
        }

        return temp == ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int x = sc.nextInt();

        Palindrome obj = new Palindrome();  // Create object to call non-static method

        if (obj.isPalindrome(x)) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is NOT Palindrome");
        }

        sc.close();
    }
}
