class Solution {
	public boolean findPattern(String s) {
		// code here
		int n = s.length();
		int i = 0;

		while (i < n) {

			int x_count = 0;

			for (; i<n; i++) {
				char ch = s.charAt(i);
				if (ch != 'x') {
					break;
				}
				x_count++;
			}
			int y_count = 0;

			for (; i<n; i++) {
				char ch = s.charAt(i);
				if (ch != 'y') {
					break;
				}
				y_count++;
			}

			if(x_count != y_count) return false;
		}

		return true;
	}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna