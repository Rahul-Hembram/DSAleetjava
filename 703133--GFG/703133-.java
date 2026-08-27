import java.util.*;

class Solution {
    public int maxArea(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;

        int result = 0;
        int[] height = new int[c];

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {
                if (mat[i][j] == 0)
                    height[j] = 0;
                else
                    height[j]++;
            }

            int[] arr = height.clone();
            Arrays.sort(arr);

            for (int j = 0; j < c; j++) {
                result = Math.max(result, arr[j] * (c - j));
            }
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna