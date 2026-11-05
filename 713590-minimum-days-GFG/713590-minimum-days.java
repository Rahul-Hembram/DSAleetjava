
class Solution {
    public int getMinimumDays(String s, int[] p) {
        int n = s.length();

        // Check if the original string is already valid
        boolean valid = true;

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                valid = false;
                break;
            }
        }

        if (valid) return 0;

        int low = 1, high = n;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            boolean[] removed = new boolean[n];

            // Mark positions replaced in the first mid days
            for (int i = 0; i < mid; i++) {
                removed[p[i]] = true;
            }

            boolean possible = true;

            // Check adjacent characters
            for (int i = 0; i < n - 1; i++) {
                if (!removed[i] && !removed[i + 1]
                        && s.charAt(i) == s.charAt(i + 1)) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna