class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length , index = 0;
        int [] result = new int[n];

        for (int num : nums) {
            if (num < pivot) {
                result[index++] = num;
            }
        }
        for (int num : nums) {
            if (num == pivot) {
                result[index++] = num;
            }
        }
        for (int num : nums) {
            if (num > pivot) {
                result[index++] = num;
            }
        }
        return result;  
    }
}