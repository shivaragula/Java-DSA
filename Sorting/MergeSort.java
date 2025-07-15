import java.util.Arrays;

public class MergeSort{

    public static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return; // Base case: If there's one element, it's already sorted.
        }

        int mid = start + (end - start) / 2; // Find the middle index.

        // Recursively divide the array into two halves.
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

        // Merge the two halves back together in sorted order.
        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] merged = new int[end - start + 1]; // Temp array for merging.
        int i = start; // Pointer for left subarray.
        int j = mid + 1; // Pointer for right subarray.
        int k = 0; // Pointer for temp merged array.

        // Compare elements from both subarrays and add the smaller one to the merged array.
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                merged[k++] = arr[i++];
            } else {
                merged[k++] = arr[j++];
            }
        }

        // Add remaining elements from the left subarray (if any).
        while (i <= mid) {
            merged[k++] = arr[i++];
        }

        // Add remaining elements from the right subarray (if any).
        while (j <= end) {
            merged[k++] = arr[j++];
        }

        // Copy the merged array back to the original array.
        for (int l = 0; l < merged.length; l++) {
            arr[start + l] = merged[l];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2, 7};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr)); // Output: [2, 3, 5, 6, 7, 8]
    }
}