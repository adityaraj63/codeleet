class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int rev = 0 , orgNum = x;

        while (orgNum != 0) {
            int dig = orgNum % 10;
            rev = rev * 10 + dig;
            orgNum /= 10;
        }
        if (rev == x) return true;
        else return false;
    }
}