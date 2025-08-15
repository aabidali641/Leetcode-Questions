
import java.util.Scanner;

public class CountPrimeInRange{
    int count = 0;
    public int FindPrime(int start , int end){
        for(int i=start; i<=end; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    } 
    public boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i=2; i*i<=n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number of the range:");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number of the range:");
        int n2 = sc.nextInt();
        CountPrimeInRange primeCounter = new CountPrimeInRange();
        int primeCount = primeCounter.FindPrime(n1, n2);
        System.out.println("Total prime numbers between " + n1 + " and " + n2 + " is: " + primeCount);
        sc.close();
    }
}