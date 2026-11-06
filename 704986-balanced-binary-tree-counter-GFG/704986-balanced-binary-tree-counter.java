class Solution {
    static long countBT(int h) {
        long mod = 1000000007;

        if (h == 0 || h == 1) {
            return 1;
        }

        long a = 1; // dp[0]
        long b = 1; // dp[1]

        for (int i = 2; i <= h; i++) {
            long c = (b * ((2 * a + b) % mod)) % mod;

            a = b;
            b = c;
        }

        return b;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna