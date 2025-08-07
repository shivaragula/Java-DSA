import java.util.*;

public class SortedAndRotatedCheck {
    public static boolean isSortedAndRotated(int[] arr) {
        int n = arr.length;
        int asc = 0, desc = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) asc++;
            if (arr[i] < arr[(i + 1) % n]) desc++;
        }

        return (asc == 1 || desc == 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        if (isSortedAndRotated(arr)) System.out.println("Yes");
        else System.out.println("No");
    }
}
