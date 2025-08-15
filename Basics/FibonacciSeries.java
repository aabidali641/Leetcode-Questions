
import java.util.Scanner;


class FibonacciSeries{
public int findFibonacciSeries(int n){
    if(n <= 1) {
        return n;
    }
    return findFibonacciSeries(n - 1) + findFibonacciSeries(n - 2);
}
public static void main(String[] args) {
    System.out.println("Please enter the number of terms in the Fibonacci series:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    FibonacciSeries fibonacci = new FibonacciSeries();
    System.out.println("Fibonacci series up to " + n + " terms:");
    for(int i = 0; i < n; i++) {
        System.out.print(fibonacci.findFibonacciSeries(i) + " ");
    }
}
}