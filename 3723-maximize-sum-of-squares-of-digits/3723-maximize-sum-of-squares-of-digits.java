class Solution { 
    public String maxSumOfSquares(int num, int sum) { 
        return sum > 9 * num ? "" : ("9".repeat(sum / 9) + (sum % 9 == 0 ? "" : sum % 9) + "0".repeat(num - sum / 9 - (sum % 9 == 0 ? 0 : 1))); 
    } 
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna