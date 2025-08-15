class LCMofTwoNumbers {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //relation between LCM and GCD is ->  LCM(a, b) = (a * b) / GCD(a,b)
    
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int num1 = 12, num2 = 18;
        System.out.println("LCM: " + lcm(num1, num2));
    }
}
