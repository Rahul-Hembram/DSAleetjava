
class Solution {
    static boolean isPossible(int n, int m, String s) {
        int lmax = 0, rmax = 0;
        int umax = 0, dmax = 0;
        int x = 0, y = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'L') y--;
            else if (c == 'R') y++;
            else if (c == 'D') x--;
            else if (c == 'U') x++;

            if (y < lmax) lmax = y;
            if (y > rmax) rmax = y;
            if (x < dmax) dmax = x;
            if (x > umax) umax = x;
        }

        if (rmax - lmax + 1 <= m &&
            umax - dmax + 1 <= n) {
            return true;
        }

        return false;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna