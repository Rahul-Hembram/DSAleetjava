class Solution {
    public int minElement(int[] nums) {
        int minVal = Integer.MAX_VALUE;
        
        for (int num : nums) {
            int currentSum = 0;
            
            while (num > 0) {
                currentSum += num % 10;
                num /= 10;
            }
            
            minVal = Math.min(minVal, currentSum);
        }
        
        return minVal;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna