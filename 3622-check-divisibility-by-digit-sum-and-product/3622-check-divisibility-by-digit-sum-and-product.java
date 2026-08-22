class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0, prod = 1 , org = n;

        while (org != 0) {
            int digit = org % 10;
            sum += digit;
            prod *= digit;
            org /= 10;
        }
        int div = sum + prod;
        
        if (n % div == 0) return true;
        else return false;
    }
}