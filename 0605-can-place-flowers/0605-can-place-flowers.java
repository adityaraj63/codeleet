class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int k = flowerbed.length;

        for (int i = 0; i < k && n > 0; i++) {
            if (flowerbed[i] == 0) {
                int prev = (i == 0) ? 0 : flowerbed[i - 1];
                int next = (i == k - 1) ? 0 : flowerbed[i + 1];

                if (prev == 0 && next == 0) {
                    flowerbed[i] = 1;
                    n--;
                    i++; 
                }
            }
        }

        return n == 0;

    }
}