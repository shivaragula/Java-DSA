public class CanJump {

    public static boolean canJump(int[] nums) {
        int goal = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }

        return goal == 0;
    }

    public static void main(String[] args) {
        // Hardcoded input
        int[] nums = {2, 3, 1, 1, 4};  // You can change this array for testing

        boolean result = canJump(nums);

        if (result) {
            System.out.println("Yes, you can jump to the last index.");
        } else {
            System.out.println("No, you cannot reach the last index.");
        }
    }
}
