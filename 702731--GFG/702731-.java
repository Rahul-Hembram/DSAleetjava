import java.util.Arrays;

class Solution
{
    int sameMod(int[] arr)
    {
        int n = arr.length;

        if (n == 1)
            return -1;

        boolean allSame = true;
        for (int i = 1; i < n; i++)
        {
            if (arr[i] != arr[0])
            {
                allSame = false;
                break;
            }
        }

        if (allSame)
            return -1;

        int max = Arrays.stream(arr).max().getAsInt();
        int ans = 0;

        for (int m = max; m > 0; m--)
        {
            int rem = arr[0] % m;
            boolean same = true;

            for (int i = 1; i < n; i++)
            {
                if (arr[i] % m != rem)
                {
                    same = false;
                    break;
                }
            }

            if (same)
                ans++;
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna