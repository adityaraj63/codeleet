class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] ans = new long[k];
        long[] dp = new long[k];

        for (int x : nums) {
            long[] next = new long[k];
            int m = x % k;

            next[m]++;

            for (int r = 0; r < k; r++) {
                next[(r * m) % k] += dp[r];
            }

            for (int r = 0; r < k; r++) {
                ans[r] += next[r];
            }

            dp = next;
        }

        return ans;
    }
}