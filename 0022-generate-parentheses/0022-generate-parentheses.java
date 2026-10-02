class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        print(ans,"",0,0,n);
        return ans;        
    }
    public void print(List<String> ans, String s, int open, int close, int n) {
        if (s.length() == 2 * n){
            ans.add(s);
            return;
        }
        if (open < n) print(ans, s+"(", open+1, close, n);
        if(close < open) print(ans, s+")", open, close+1, n);
    }
}