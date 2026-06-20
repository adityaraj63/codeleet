import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix.length == 0) return ans;

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int c = left; c <= right; c++) {
                ans.add(matrix[top][c]);
            }
            top++;

            for (int r = top; r <= bottom; r++) {
                ans.add(matrix[r][right]);
            }
            right--;

            if (top <= bottom) {
                for (int c = right; c >= left; c--) {
                    ans.add(matrix[bottom][c]); 
                }
                bottom--;
            }
            if (left <= right) {
                for (int r = bottom; r >= top; r--) {
                    ans.add(matrix[r][left]); 
                }
                left++;
            }
        }
        return ans;
    }
}