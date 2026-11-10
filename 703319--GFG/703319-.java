class Solution {
    public int firstElementKTime(int[] arr, int k) {
        HashMap<Integer,Integer> map= new HashMap<> ();
        for(int a : arr)
        {
            map.put(a,map.getOrDefault(a,0)+1);
            if(map.get(a)==k)
            {
                return a;
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna