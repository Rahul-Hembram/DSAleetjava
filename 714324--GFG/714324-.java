class Solution {
    public int minimumSum(String s) {
        int n = s.length();
        int prev = -1, sum = 0;

        for (int i = 0; i < (n + 1) / 2; i++) {
            int j = n - 1 - i;
            char a = s.charAt(i);
            char b = s.charAt(j);
            char c;

            if (a == '?' && b == '?') {
                continue;
            } else if (a == '?') {
                c = b;
            } else if (b == '?' || a == b) {
                c = a;
            } else {
                return -1;
            }

            if (prev != -1) {
                sum += Math.abs(c - prev);
            }

            prev = c;
        }

        return 2 * sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna