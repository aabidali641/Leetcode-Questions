import java.util.Arrays;
import java.util.Scanner;

class RotateArray {
    // Helper method to reverse part of array
    public static void reverse(int nums[], int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // Method to rotate the array
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);     // Reverse whole array
        reverse(nums, 0, k - 1);     // Reverse first k elements
        reverse(nums, k, n - 1);     // Reverse remaining elements
    }

    // Main method to run in VS Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        RotateArray rt = new RotateArray();
        rt.rotate(nums, k);

        System.out.println("Rotated array: " + Arrays.toString(nums));
    }
}
