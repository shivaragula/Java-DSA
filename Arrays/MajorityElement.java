import java.util.Scanner;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int res = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                res = num;
                count = 1;
            } else if (num == res) {
                count++;
            } else {
                count--;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = majorityElement(nums);
        System.out.println("Majority Element: " + result);

        sc.close();
    }
}
