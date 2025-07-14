import java.util.Arrays;

public class RotateArray {

    public static void Reverse(int nums[], int i, int j) {
        int left = i;
        int right = j;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k < 0) {
            k += nums.length;
        }

        Reverse(nums, 0, nums.length - 1);
        Reverse(nums, k, nums.length - 1);
        Reverse(nums, 0, k - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println(Arrays.toString(nums));
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}
