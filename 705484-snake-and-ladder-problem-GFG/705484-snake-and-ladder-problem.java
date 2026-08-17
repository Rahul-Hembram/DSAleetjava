import java.util.*;

class Solution {

    public int minThrows(int n, int[] ladders, int[] snakes) {

        int destination = n * n;

        // jump[i] = position we reach after landing on i
        // Initially, every position leads to itself.
        int[] jump = new int[destination + 1];

        for (int i = 1; i <= destination; i++) {
            jump[i] = i;
        }

        // Add ladders
        for (int i = 0; i + 1 < ladders.length; i += 2) {
            jump[ladders[i]] = ladders[i + 1];
        }

        // Add snakes
        for (int i = 0; i + 1 < snakes.length; i += 2) {
            jump[snakes[i]] = snakes[i + 1];
        }

        // BFS
        boolean[] visited = new boolean[destination + 1];

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        visited[1] = true;

        int throwsCount = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();

            // All positions in this level require the same
            // number of dice throws.
            for (int i = 0; i < size; i++) {

                int current = queue.poll();

                // Reached destination
                if (current == destination) {
                    return throwsCount;
                }

                // Try dice values 1 to 6
                for (int dice = 1; dice <= 6; dice++) {

                    int next = current + dice;

                    if (next > destination) {
                        break;
                    }

                    // Take snake or ladder immediately
                    next = jump[next];

                    if (!visited[next]) {
                        visited[next] = true;
                        queue.add(next);
                    }
                }
            }

            throwsCount++;
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna