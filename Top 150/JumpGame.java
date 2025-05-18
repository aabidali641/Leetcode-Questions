public class JumpGame {

    // Method to check if we can jump to the last index
    public boolean canJump(int[] nums) {
        int finalPosition = nums.length - 1;

        for (int idx = nums.length - 2; idx >= 0; idx--) {
            if (idx + nums[idx] >= finalPosition) {
                finalPosition = idx;
            }
        }

        return finalPosition == 0;
    }

    // Main method to run and test the code
    public static void main(String[] args) {
        JumpGame obj = new JumpGame();

        int[] nums = {2, 3, 1, 1, 4};
        

        boolean result = obj.canJump(nums);
        System.out.println("Can Jump to Last Index? " + result);
    }
}
