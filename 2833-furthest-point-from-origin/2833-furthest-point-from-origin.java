class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left = 0, right = 0, blanks = 0;

        for (char c : moves.toCharArray()) {
            if (c == 'L') left++;
            else if (c == 'R') right++;
            else blanks++;
        }

        return Math.abs(left - right) + blanks;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna