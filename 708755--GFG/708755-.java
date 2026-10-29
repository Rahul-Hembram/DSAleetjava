class Solution {
    public int minComputation(int[] files) {
        // code here
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int file:files) {
            queue.offer(file);
        }

        int sum = 0;
        while(queue.size()>1) {
            int merge = 0;
            merge+=queue.poll();
            merge+=queue.poll();
            sum += merge;
            queue.offer(merge);
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna