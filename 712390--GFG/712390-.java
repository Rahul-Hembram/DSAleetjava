class Solution {
    public boolean canServe(int[] arr) {
        int five = 0;
        int ten = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 5) {
                five++;
            }

            else if (arr[i] == 10) {
                if (five == 0) {
                    return false;
                }

                five--;
                ten++;
            }

            else if (arr[i] == 20) {
                // Prefer giving 10 + 5
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                }

                // Otherwise give 5 + 5 + 5
                else if (five >= 3) {
                    five -= 3;
                }

                else {
                    return false;
                }
            }
        }

        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna