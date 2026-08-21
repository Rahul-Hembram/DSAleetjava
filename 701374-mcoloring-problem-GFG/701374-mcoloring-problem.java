class Solution {

    boolean isSafe(int node, int newColor, int[][] edges, int[] color) {

        for (int i = 0; i < edges.length; i++) {

            int u = edges[i][0];
            int v = edges[i][1];

            if (u == node && color[v] == newColor) {
                return false;
            }

            if (v == node && color[u] == newColor) {
                return false;
            }
        }

        return true;
    }

    boolean solve(int node, int[][] edges, int v, int m, int[] color) {

        if (node == v) {
            return true;
        }

        for (int c = 1; c <= m; c++) {

            if (isSafe(node, c, edges, color)) {

                color[node] = c;

                if (solve(node + 1, edges, v, m, color)) {
                    return true;
                }

                color[node] = 0; // Backtrack
            }
        }

        return false;
    }

    boolean graphColoring(int v, int[][] edges, int m) {

        int[] color = new int[v];

        return solve(0, edges, v, m, color);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna