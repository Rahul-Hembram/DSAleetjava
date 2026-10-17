class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length, ans = 0;
        int[][] x = new int[n][];
        for (int i = 0; i < n; i++) {
            int s = 0, v = nums[i];
            while (v > 0) {
                s += v % 10;
                v /= 10;
            }
            x[i] = new int[] {s, nums[i], i};
        }
        Arrays.sort(x, (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0])
                : a[1] != b[1] ? Integer.compare(a[1], b[1]) : Integer.compare(a[2], b[2]));
        int[] vis = new int[n];
        for (int i = 0; i < n; i++) {
            if (vis[i] != 0) continue;
            int j = i, len = 0;
            while (vis[j] == 0) {
                vis[j] = 1;
                j = x[j][2];
                len++;
            }
            ans += len - 1;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna