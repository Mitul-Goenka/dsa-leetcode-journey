class Solution {
    public int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int res = 0;
        int res2 = 0;
        boolean[][] vis2 = new boolean[n][m];      
            for(int j=0;j<m;j++){
                if(grid[0][j]==0 && vis2[0][j]==false){
                    dfs(grid , n , m , 0 , j , vis2);
                    res2++;
                }
            }
            for(int i=0;i<n;i++){
                if(grid[i][0]==0 && vis2[i][0]==false){
                    dfs(grid , n , m , i , 0 , vis2);
                    res2++;
                }
            }
            for(int j=0;j<m;j++){
                if(grid[n-1][j]==0 && vis2[n-1][j]==false){
                    dfs(grid , n , m , n-1 , j , vis2);
                    res2++;
                }
            }
        int d = m-1;
            for(int i=0;i<n;i++){
                if(grid[i][d]==0 && vis2[i][d]==false){
                    dfs(grid , n , m , i , d , vis2);
                    res2++;
                }
            }
        boolean[][] vis = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0 && vis[i][j]==false){
                    dfs(grid , n , m , i , j , vis);
                    res++;
                }
            }
        }
        return res - res2;
    }
    int[] x = {-1 , 1 , 0 , 0};
    int[] y = {0 , 0 , -1 , 1};
    boolean isValid(int i , int j , int n , int m){
        if(i>=n || i<0 || j>=m || j<0){
            return false;
        }
        return true;
    }
    void dfs(int[][] grid ,int n ,int m , int i ,int j , boolean[][] vis){
        vis[i][j] = true;
        for(int k=0;k<4;k++){
            int row = i + x[k];
            int col = j + y[k];
            if(isValid( row , col , n , m) && grid[row][col]==0 && vis[row][col]==false){
                dfs(grid , n , m , row , col , vis);
            }
        }
        return;
    }
}