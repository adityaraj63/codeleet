class Solution {
    public int minMoves(int[] nums) {
        int maxElement = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxElement = Math.max(maxElement, nums[i]);
        }

        int totalMoves = 0;

        for (int i = 0; i < nums.length; i++) {
            totalMoves += maxElement - nums[i];
        }
        return totalMoves;
    }
}