class Solution {
    public int subarrayXor(int[] arr) {
        int n = arr.length;
        int res = 0;

        for (int i = 0; i < n; i++) {
            int total = (i + 1) * (n - i);

            if (total % 2 == 0) continue;

            res ^= arr[i];
        }

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna