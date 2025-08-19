import java.util.*;

class MaximumProductSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array must have at least 1 element.");
            sc.close();
            return;
        }

        int[] nums = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int curMax = nums[0];
        int curMin = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = curMax;
            curMax = Math.max(nums[i], Math.max(curMax * nums[i], curMin * nums[i]));
            curMin = Math.min(nums[i], Math.min(temp * nums[i], curMin * nums[i]));
            result = Math.max(result, curMax);
        }

        System.out.println("Maximum Product Subarray: " + result);
        sc.close();
    }
}
