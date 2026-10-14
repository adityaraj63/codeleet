class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int k = primes.length;
        int[] dp = new int[n];
        int[] index = new int[k];

        dp[0] = 1;

        for (int i = 1; i < n; i++) {
            long min = Long.MAX_VALUE;

            for (int j = 0; j < k; j++) {
                min = Math.min(min, (long) dp[index[j]] * primes[j]);
            }

            dp[i] = (int) min;

            for (int j = 0; j < k; j++) {
                if ((long) dp[index[j]] * primes[j] == min) {
                    index[j]++;
                }
            }
        }

        return dp[n - 1];
    }
}