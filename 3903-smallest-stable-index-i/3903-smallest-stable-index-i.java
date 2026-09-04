class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] suffix = new int[n];
 
        int mn = Integer.MAX_VALUE;
        // Build suffix minimum
        for (int i = n - 1; i >= 0; i--) {
            mn = Math.min(mn, nums[i]);
            suffix[i] = mn;
        }
 
        int mx = 0;
        // Find first index with score <= k
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, nums[i]);
            int score = mx - suffix[i];
            if (score <= k)
                return i;
        }
 
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna