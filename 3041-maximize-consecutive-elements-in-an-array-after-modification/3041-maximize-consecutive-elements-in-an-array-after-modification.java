class Solution {
    public int maxSelectedElements(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> dp = new HashMap<>();
        int maxLen = 0;

        for (int x : nums) {
            int v1 = dp.getOrDefault(x, 0) + 1;
            int v2 = dp.getOrDefault(x - 1, 0) + 1;

            int nextVal = Math.max(dp.getOrDefault(x + 1, 0), v1);
            int currVal = Math.max(dp.getOrDefault(x, 0), v2);

            dp.put(x + 1, nextVal);
            dp.put(x, currVal);

            maxLen = Math.max(maxLen, Math.max(nextVal, currVal));
        }

        return maxLen;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna