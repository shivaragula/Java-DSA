class CanJump2 {
    public int jump(int[] nums) {
        int n = nums.length;
        
        // If the array has only one element, no jumps are needed
        if (n == 1) return 0;

        int jumps = 0;   // Count the number of jumps
        int far = 0;     // Tracks the farthest we can reach
        int end = 0;     // Marks the end of the current jump range

        // Loop through the array (but not including the last index)
        for (int i = 0; i < n - 1; i++) {
            // Update the farthest position we can reach
            far = Math.max(far, i + nums[i]);

            // When we reach the end of the current jump range
            if (i == end) {
                jumps++;      // Increment the jump counter
                end = far;    // Update the jump range to the farthest we can reach

                // If the updated range already reaches or exceeds the last index, stop early
                if (end >= n - 1) break;
            }
        }

        return jumps; // Return the minimum number of jumps
    }
}
