public class SwapTwoNumbersWithout3rdVariable {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping without using a third variable
        a = a + b; // Step 1: a now becomes 15 (5 + 10)
        b = a - b; // Step 2: b becomes 5 (15 - 10)
        a = a - b; // Step 3: a becomes 10 (15 - 5)

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}