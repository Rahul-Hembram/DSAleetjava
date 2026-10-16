class Solution {
    public int countAlwaysFound(int[] arr) {
        int n = arr.length;
        int[] suf = new int[n + 1];
        suf[n] = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) suf[i] = Math.min(suf[i + 1], arr[i]);
        int mx = Integer.MIN_VALUE, cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > mx && arr[i] < suf[i + 1]) cnt++;
            mx = Math.max(mx, arr[i]);
        }
        return cnt;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna