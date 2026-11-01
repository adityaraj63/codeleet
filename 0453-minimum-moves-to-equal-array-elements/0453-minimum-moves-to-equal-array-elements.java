class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int minMoves = 0;
        for (int i = n-1; i >= 0; i--) {
            minMoves += nums[i] - nums[0];
        }
        return minMoves;      
    }
}