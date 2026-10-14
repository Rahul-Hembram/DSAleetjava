class Solution {
    public String findRollOut(String s, int[] roll) {
        int n = s.length();
        int[] hash = new int[n + 2];

        // Count roll operations at each prefix endpoint
        for (int x : roll) {
            hash[x]++;
        }

        // Suffix sum: number of rolls affecting each position
        for (int i = n - 1; i >= 1; i--) {
            hash[i] += hash[i + 1];
        }

        char[] ch = s.toCharArray();

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                ch[i - 1] = (char) ((ch[i - 1] - 'a' + hash[1]) % 26 + 'a');
            } else {
                ch[i - 1] = (char) ((ch[i - 1] - 'a' + hash[i]) % 26 + 'a');
            }
        }

        return new String(ch);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna