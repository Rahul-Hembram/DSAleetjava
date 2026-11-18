class Solution {
    public int minChanges(String s) {
        return (int) IntStream.range(0, s.length() / 2).filter(i -> s.charAt(2 * i) != s.charAt(2 * i + 1)).count();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna