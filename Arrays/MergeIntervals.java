import java.util.*;

class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    
        List<int[]> merged = new ArrayList<>();

        for (int[] interval : intervals) {

            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
            
                merged.add(interval);


            } else {
             
                int prevEnd = merged.get(merged.size() - 1)[1];
                int currEnd = interval[1];

               
                merged.get(merged.size() - 1)[1] = Math.max(prevEnd, currEnd);

               
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = { {1,3}, {2,6}, {8,10}, {15,18} };
        int[][] result = merge(intervals);

        System.out.print("Merged Intervals: ");
        for (int[] interval : result) {
            System.out.print(Arrays.toString(interval) + " ");
        }
    }
}
