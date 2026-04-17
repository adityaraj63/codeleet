class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int index = 0;

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }
            chars[index++] = currentChar;

            if (count > 1) {
                char[] countChars = String.valueOf(count).toCharArray();
                for (char c : countChars) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }
}