import java.util.Arrays;
public class Hindex1 {
    public int hIndex(int[] citations) {
        int n = citations.length;
        
        // If the array is empty, return 0
        if (n == 0) return 0;

        // Sort the citations in non-decreasing order
        Arrays.sort(citations);

        // Initialize h-index
        int hIndex = 0;

        // Traverse the sorted array from the end
        for (int i = n - 1; i >= 0; i--) {
            // The h-index is the maximum value where citations[i] >= hIndex + 1
            if (citations[i] >= n - i) {
                hIndex = n - i;
            } else {
                break; // No need to check further as we are going backwards
            }
        }

        return hIndex; // Return the computed h-index
    }
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        Hindex1 hIndexCalculator = new Hindex1();
        int result = hIndexCalculator.hIndex(citations);  
        System.out.println("H-index: " + result); // Expected output: 3
        
    }
    
}
