class Solution {
    public ArrayList<Integer> countVowels(String s, int[][] queries) {
        // code here
        int n = s.length();
                int[] p = new int[n + 1];
                for (int i = 0; i < n; i++) {
                    char c = s.charAt(i);
                    int v = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
                    p[i + 1] = p[i] + v;
                }
                ArrayList<Integer> res = new ArrayList<>();
                for (int[] q : queries) {
                    res.add(p[q[1] + 1] - p[q[0]]);
                }
                return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna