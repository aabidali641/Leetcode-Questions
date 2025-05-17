
class RemoveElements {
    public int remove(int nums[], int val) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        RemoveElements rem = new RemoveElements();
        int newLength = rem.remove(nums, val);  // Store returned length

        // Print only up to newLength
        System.out.print("Array after removing " + val + " : [");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i]);
            if (i < newLength - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
