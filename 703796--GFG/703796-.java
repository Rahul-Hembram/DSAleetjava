class Solution {
    static long pairAndSum(int arr[]) {
        long ans = 0;

        for (int bit = 0; bit < 32; bit++) {
            long count = 0;

            for (int x : arr) {
                if ((x & (1L << bit)) != 0) {
                    count++;
                }
            }

            ans += (count * (count - 1) / 2) * (1L << bit);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna