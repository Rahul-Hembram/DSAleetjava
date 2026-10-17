
class Solution {
    boolean isItPossible(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int n = s1.length();
        int i = 0, j = 0;

        while (i < n && j < n) {
            while (i < n && s1.charAt(i) == '#') {
                i++;
            }

            while (j < n && s2.charAt(j) == '#') {
                j++;
            }

            if (i == n || j == n) {
                break;
            }

            char c = s1.charAt(i);

            if (c != s2.charAt(j)) {
                return false;
            }

            // A can only move left
            if (c == 'A' && i < j) {
                return false;
            }

            // B can only move right
            if (c == 'B' && i > j) {
                return false;
            }

            i++;
            j++;
        }

        while (i < n) {
            if (s1.charAt(i++) != '#') {
                return false;
            }
        }

        while (j < n) {
            if (s2.charAt(j++) != '#') {
                return false;
            }
        }

        return true;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna