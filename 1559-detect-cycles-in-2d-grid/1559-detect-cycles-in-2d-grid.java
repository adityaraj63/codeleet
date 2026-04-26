class Solution {
    public boolean containsCycle(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!vis[i][j]) {
                    if (dfs(grid, vis, i, j, -1, -1, grid[i][j])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    private boolean dfs(char[][] grid, boolean[][] vis, int i, int j, int pi, int pj, char ch) {
        int m = grid.length, n = grid[0].length;
        
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] != ch) {
            return false;
        }
        
        if (vis[i][j]) {
            return true;
        }
        
        vis[i][j] = true;
        
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        
        for (int k = 0; k < 4; k++) {
            int ni = i + dx[k];
            int nj = j + dy[k];
            
            if (ni == pi && nj == pj) continue;
            
            if (dfs(grid, vis, ni, nj, i, j, ch)) {
                return true;
            }
        }
        
        return false;
    }
}