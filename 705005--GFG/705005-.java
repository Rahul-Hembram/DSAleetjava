class Solution {
    public int minSquares(int n, int m) {
        // code here
        int count = 0;
        while (n > 0 && m > 0) {
            if (n > m) {
                count += n / m;
                n %= m;
            } else {
                count += m / n;
                m %= n;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna