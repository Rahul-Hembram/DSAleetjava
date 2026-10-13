class Solution {
    public ArrayList<Integer> update(int n, int[] updates) {

        int[] diff = new int[n];

        for (int j : updates) {
            diff[j - 1]++;
        }

        for (int i = 1; i < n; i++) {
            diff[i] += diff[i - 1];
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int value : diff) {
            result.add(value);
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna