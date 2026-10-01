class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        char[] stack = new char[s.length()];
        int head = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack[head++] = ')';
            } else if (c == '{') {
                stack[head++] = '}';
            } else if (c == '[') {
                stack[head++] = ']';
            } else {
                if (head == 0 || stack[--head] != c) {
                    return false;
                }
            }
        }

        return head == 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna