class Solution {

    public int goodIndices(int[] arr) {
        int n = arr.length;
        int[] phase = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (phase[i] == 0) {
                code(i, n, arr, phase);
            }

            if (phase[i] == 2) {
                count++;
            }
        }

        return count;
    }

    private boolean code(int i, int n, int[] arr, int[] phase) {

        if (i < 0 || i >= n || phase[i] == 2) {
            return true;
        }

        if (phase[i] == 1) {
            return false;
        }

        phase[i] = 1;

        boolean result = code(i + arr[i], n, arr, phase);

        if (result) {
            phase[i] = 2;
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna