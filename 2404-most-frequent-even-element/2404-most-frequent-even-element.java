class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        int count = 1 , maxCount = 0 , ans = -1;

        for (int i = 0; i < nums.length; i++) {
            count = 1;
        
        while (i + 1 < nums.length && nums[i] == nums[i+1]) 
        {
            count++;
            i++;
        
        }
        if (nums[i] % 2 == 0) {
            if (count > maxCount) {
                maxCount = count;
                ans = nums[i];
            }
            }
        }
        return ans;
    }
}