import java.util.Arrays;

class Solution {
    public String smallestPalindrome(String s) {

        int n = s.length();

        char[] firstHalf = s.substring(0, n / 2).toCharArray();
        Arrays.sort(firstHalf);

        String left = new String(firstHalf);

        if (n % 2 == 0) {
            return left + new StringBuilder(left).reverse().toString();
        }

        return left + s.charAt(n / 2)
                + new StringBuilder(left).reverse().toString();
    }
}