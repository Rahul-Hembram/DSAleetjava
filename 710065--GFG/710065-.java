class Solution {
    public int solve(int n, String s) {
        int cnt = 0;
        char[] state = new char[26];

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'A';

            // Customer arrives first time
            if (state[idx] == '\u0000') {
                if (n > 0) {
                    n--;
                    state[idx] = 'A'; // got a computer
                } else {
                    cnt++;
                    state[idx] = 'N'; // no computer available
                }
            }
            // Customer leaves
            else if (state[idx] == 'A') {
                n++;
                state[idx] = 'D';
            }
            else if (state[idx] == 'N') {
                state[idx] = 'D';
            }
        }

        return cnt;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna