import java.util.*;

class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        // Input: [[1,3],[2,6],[8,10],[15,18]]

        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // Sorted: [[1,3],[2,6],[8,10],[15,18]]

        List<int[]> merged = new ArrayList<>();

        // Step 2: Iterate through each interval
        for (int[] interval : intervals) {

            // If merged is empty OR prev interval’s end < current start
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                // No overlap → just add current interval
                merged.add(interval);

                // Example:
                // First interval [1,3] → merged = [[1,3]]
                // Later [8,10] → prevEnd=6, currentStart=8 → no overlap → add → [[1,6],[8,10]]

            } else {
                // Overlap → merge with prev interval
                int prevEnd = merged.get(merged.size() - 1)[1];
                int currEnd = interval[1];

                // Extend prev interval’s end to max(prevEnd, currEnd)
                merged.get(merged.size() - 1)[1] = Math.max(prevEnd, currEnd);

                // Example:
                // Prev interval = [1,3], Current interval = [2,6]
                // prevEnd=3, currEnd=6 → merge into [1,6]
                // merged = [[1,6]]
            }
        }

        // Step 3: Convert list to array
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
