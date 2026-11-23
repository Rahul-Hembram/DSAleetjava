class Solution {
    static char posInfinite(String s, int pos) {
        StringBuilder A = new StringBuilder(s);
        int n = 1;
        int N = A.length();

        while (N < pos) {
            A.reverse();
            String str = A.toString();
            A.reverse();

            for (int i = 0; i < n; i++) {
                A.append("$");
            }

            A.append(str);
            n++;
            N = A.length();
        }

        int p = N - pos;
        String f = A.reverse().toString();
        char c = f.charAt(p);

        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna