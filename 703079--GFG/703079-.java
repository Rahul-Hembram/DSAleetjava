 class Solution {

    public int subsequenceSum(String s) {

        int n = s.length();

        if (n == 0) return 0; // Edge case protection



        int mod = 1_000_000_007;

        long sum = 0;



        // 1. Single pass to sum digits (toCharArray is slightly faster than charAt)

        for (char c : s.toCharArray()) {

            sum += c - '0';

        }

        sum %= mod;



        // 2. Calculate 2^(n-1) % mod in O(log n) time

        long pow = power(2, n - 1, mod);



        return (int) ((sum * pow) % mod);

    }



    // Binary Exponentiation helper

    private long power(long base, long exp, int mod) {

        long res = 1;

        base %= mod;

        while (exp > 0) {

            if ((exp & 1) == 1) { // If exp is odd

                res = (res * base) % mod;

            }

            base = (base * base) % mod;

            exp >>= 1; // Divide exp by 2

        }

        return res;

    }

}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna