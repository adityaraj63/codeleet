class Solution {
    public int minimumCost(int[] cost) {
        int c = 0;
        Arrays.sort(cost);
        int ans = 0;
        for(int i = cost.length-1;i>=0;i--){
            if(c != 2){
                ans += cost[i];
                c++;
            }
            else{
                c = 0;
            }
        }
        return ans;
    }
}