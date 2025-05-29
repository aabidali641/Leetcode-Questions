import java.util.Scanner;

class PrimeNumber {
    public void checkPrime(int num){
        if(num <= 1){
            System.out.println(num + " is NOT a Prime Number");
            return;
        }

        boolean isPrime = true;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is NOT a Prime Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        PrimeNumber obj = new PrimeNumber();
        obj.checkPrime(num);
    }
}
