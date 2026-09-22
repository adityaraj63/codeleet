import java.util.*;

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean odd = false;

        for (int count : map.values()) {
            length += (count / 2) * 2;

            if (count % 2 == 1) {
                odd = true;
            }
        }

        return odd ? length + 1 : length;
    }
}