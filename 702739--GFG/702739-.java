class Solution {
    public int minProd(int[] arr) {
        // code here
        int n = arr.length;

        int ans = Integer.MAX_VALUE;



        for (int mask = 1; mask < (1 << n); mask++) {

            int product = 1;



            for (int i = 0; i < n; i++) {

                if ((mask & (1 << i)) != 0) {

                    product *= arr[i];

                }

            }



            ans = Math.min(ans, product);

        }



        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna