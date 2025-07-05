import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int L = 1;
        for (int R = 1; R < nums.length; R++) {
            if (nums[R] != nums[R - 1]) {
                nums[L] = nums[R];
                L++;
            }
        }
        return L;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int newLength = removeDuplicates(nums);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("\nNew length: " + newLength);

        sc.close();
    }
}
