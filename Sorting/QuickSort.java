public class QuickSort {

    // Main Quick Sort function
    public static void quickSort(int[] arr, int low, int high) {
        // Base case: If the array has 0 or 1 element, it is already sorted
        if (low < high) {
            // Step 1: Partition the array and get the pivot index
            // For example, if arr = [8, 3, 7, 6, 2, 5], low = 0, high = 5,
            // partition(arr, 0, 5) will rearrange the array around the pivot (5),
            // and return the index where 5 is placed (say, index 3).
            int pivotIndex = partition(arr, low, high);

            // Step 2: Recursively sort the left part (elements less than pivot)
            quickSort(arr, low, pivotIndex - 1);

            // Step 3: Recursively sort the right part (elements greater than pivot)
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition function: Rearranges the array and returns the pivot index
    public static int partition(int[] arr, int low, int high) {
        // Choosing the last element as the pivot
        int pivot = arr[high];

        // Pointer for the smaller element
        int i = low - 1;

        // Loop through the array from 'low' to 'high - 1'
        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++; // Move the pointer for smaller elements

                // Swap arr[i] and arr[j] to place the smaller element on the left
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at i+1
        // This places the pivot in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the index of the pivot
        return i + 1;
    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main driver function
    public static void main(String[] args) {
        // Example input array
        int[] arr = {8, 3, 7, 6, 2, 5};

        System.out.println("Original Array:");
        printArray(arr);

        // Call quickSort on the entire array
        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}