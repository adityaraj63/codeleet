class Solution {
    public int maxNumberOfFamilies(int n, int[][] r) {
         Map<Integer, Integer> m = new HashMap<>();

        for (int[] x : r) {
            if (x[1] >= 2 && x[1] <= 9)
                m.merge(x[0], 1 << (x[1] - 2), (a, b) -> a | b);
        }

        int ans = (n - m.size()) * 2;
        int l = 15, mid = 60, rr = 240;

        for (int x : m.values()) {
            boolean a = (x & l) == 0;
            boolean b = (x & mid) == 0;
            boolean c = (x & rr) == 0;

            if (a && c) ans += 2;
            else if (a || b || c) ans++;
        }
        return ans;
    }
}