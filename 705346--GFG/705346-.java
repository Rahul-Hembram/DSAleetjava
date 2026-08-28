class Solution {
    public int minCost(int[][] mat) {
        int n = mat.length;

        int[] vec = new int[3];
        vec[0] = mat[0][0];
        vec[1] = mat[0][1];
        vec[2] = mat[0][2];

        for (int i = 1; i < n; i++) {
            int t0 = mat[i][0] + Math.min(vec[1], vec[2]);
            int t1 = mat[i][1] + Math.min(vec[0], vec[2]);
            int t2 = mat[i][2] + Math.min(vec[0], vec[1]);

            vec[0] = t0;
            vec[1] = t1;
            vec[2] = t2;
        }

        return Math.min(vec[0], Math.min(vec[1], vec[2]));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna