public class Hindex2 {
    public int hIndex (int[] citations){
        int n = citations.length;
        int low = 0, high = n - 1;
        while (low <= high) {
          
            int mid = low + (high - low) / 2;
              int h = n-mid;
            // Check if the current mid index can be the h-index
            if (citations[mid] == h) {
                return h; // Move left to find a potentially higher h-index
            }else if (citations[mid] > h) {
                high = mid - 1; // Move left to find a potentially higher h-index
            }else {
                low = mid + 1; // Move right to find a valid h-index
            }
        }
        return n - low; // If no exact match, return the maximum h-index found
    }
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        Hindex2 hIndexCalculator = new Hindex2();
        int result = hIndexCalculator.hIndex(citations);  
        System.out.println("H-index: " + result); 
    }
}
