class Solution {
    static long count(int n) {
    // code here
        int totalEdges = n * (n - 1) / 2;
        // Total graphs = 2^(totalEdges)
        return (long) Math.pow(2, totalEdges);
  }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna