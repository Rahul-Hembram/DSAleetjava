class Solution {
    public int maxDiffSum(int[] arr) {
        int n = arr.length;

        if (n <= 1)
            return 0;

        int low = 0, high = 0;

        for (int i = 1; i < n; i++) {

            // When arr[i] is changed to 1
            int newLow = Math.max(low, high + Math.abs(arr[i - 1] - 1));

            // When arr[i] is kept unchanged
            int newHigh = Math.max(
                low + Math.abs(arr[i] - 1),
                high + Math.abs(arr[i] - arr[i - 1])
            );

            low = newLow;
            high = newHigh;
        }

        return Math.max(low, high);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna