class Solution {
    static char posInfinite(String s, int pos) {
        long[] len = new long[100];
        int[] sep = new int[100];

        len[0] = s.length();
        int level = 0;

        // Calculate lengths only
        while (len[level] < pos) {
            level++;
            sep[level] = level;
            len[level] = 2 * len[level - 1] + level;
        }

        long p = pos;

        // Trace the position backwards
        while (level > 0) {
            long oldLen = len[level - 1];
            long separators = sep[level];

            if (p <= oldLen) {
                // Position is in the original part
            } 
            else if (p <= oldLen + separators) {
                return '$';
            } 
            else {
                // Position is in the reversed part
                p = oldLen - (p - oldLen - separators) + 1;
            }

            level--;
        }

        return s.charAt((int) p - 1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna