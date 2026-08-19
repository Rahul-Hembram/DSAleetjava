import java.util.*;

class Solution {

    long countT(int[] arr, int n, long x) {
        long ans = 0;

        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                long sum = (long) arr[i] + arr[j] + arr[k];

                if (sum <= x) {
                    ans += (k - j);
                    j++;
                } else {
                    k--;
                }
            }
        }

        return ans;
    }

    long countTriplets(int[] arr, int l, int r) {
        int n = arr.length;

        Arrays.sort(arr);

        return countT(arr, n, r) - countT(arr, n, (long) l - 1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna