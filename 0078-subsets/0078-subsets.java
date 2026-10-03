class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int num : nums) {
            List<List<Integer>> newSubsets = new ArrayList<>();

            for (List<Integer> subset : result) {
                List<Integer> newSet = new ArrayList<>(subset);
                newSet.add(num);
                newSubsets.add(newSet);
            }
            result.addAll(newSubsets);
        }
        return result;      
    }
}