public class StrongNumber {

    public int findStrongNumber(int n) {
        int sum = 0;
        int temp = n;

        while (n > 0) {
            int digit = n % 10;
            sum += findFact(digit);
            n /= 10;
        }

        return sum; // return sum so we can compare later
    }

    public int findFact(int n) {
        if (n <= 1) return 1;
        return n * findFact(n - 1);
    }

    public static void main(String[] args) {
        StrongNumber sn = new StrongNumber();
        int number = 145;

        if (sn.findStrongNumber(number) == number) {
            System.out.println(number + " is a Strong Number");
        } else {
            System.out.println(number + " is NOT a Strong Number");
        }
    }
}
