class Solution {
    // Define a memoization table to store results of subproblems.
    private Boolean[][] memo;

    public boolean check(int[] stones, int k, int current) {
        if (current == stones.length - 1) return true;

        // Check if we have already calculated the result for this state.
        if (memo[current][k] != null) return memo[current][k];

        for (int i = k - 1; i <= k + 1; i++) {
            if (i > 0) {
                int temp = current + 1;
                while (true) {
                    if (temp >= stones.length) break;
                    if (i + stones[current] == stones[temp]) {
                        if (check(stones, i, temp)) {
                            // Store the result in the memoization table.
                            memo[current][k] = true;
                            return true;
                        }
                        break;
                    }
                    if (i + stones[current] < stones[temp]) break;
                    temp++;
                }
            }
        }

        // Store the result in the memoization table.
        memo[current][k] = false;
        return false;
    }

    public boolean canCross(int[] stones) {
        int k = 0;
        // Initialize the memoization table with null values.
        memo = new Boolean[stones.length][stones.length];
        return check(stones, k, 0);
    }
}
