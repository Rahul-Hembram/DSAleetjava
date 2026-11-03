class Solution {
    public int minMoves(int[] nums) {
        int top = Arrays.stream(nums).max().getAsInt(), moves = 0;
        for (int x : nums) moves += top - x;
        return moves;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna