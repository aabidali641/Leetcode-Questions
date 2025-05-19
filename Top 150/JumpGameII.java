import java.util.*;

public class JumpGameII {

    public static int jump(int[] nums) {
        int jumps = 0;
        int finalPosition = 0;
        int idx = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            idx = Math.max(idx, i + nums[i]);

            if (i == finalPosition) {
                jumps++;
                finalPosition = idx;
            }
        }

        return jumps;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        int result = jump(nums);
        System.out.println("Minimum jumps to reach end: " + result);
    }
}
