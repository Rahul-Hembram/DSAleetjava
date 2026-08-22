class Solution {
    public boolean checkDivisibility(int n) {
        int sumDigit = 0;
        int productDigit = 1;
        int num = n;


        while (num > 0) {
            sumDigit += num % 10;
            productDigit *= num % 10;
            num /= 10;
        }


        return n % (sumDigit + productDigit) == 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna