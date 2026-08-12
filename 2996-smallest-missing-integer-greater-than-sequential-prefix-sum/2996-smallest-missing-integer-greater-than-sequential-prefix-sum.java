class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];

        for (int i = 1; i < nums.length && nums[i] == nums[i - 1] + 1; i++)
            sum += nums[i];

        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        while (set.contains(sum)) sum++;
        return sum;
    }
}