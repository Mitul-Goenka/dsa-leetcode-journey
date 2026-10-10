class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int res=0;
        int i , j;
        boolean[][] vis = new boolean[n][];
        for(int d=0;d<n;d++){
            boolean[] t = new boolean[m];
            vis[d] = t;
        }
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(grid[i][j]=='1' && vis[i][j]==false){
                    dfs(grid , n , m ,i ,j , vis);
                    res++;
                }
            }
        }
        return res;
    }
    int[] x = {-1 , 1 , 0 , 0};
    int[] y = {0,0,-1,1};
    void dfs(char[][] grid , int n , int m , int i , int j ,boolean[][] vis){
        vis[i][j] = true;
        for(int k=0;k<4;k++){
            int row = i + x[k];
            int col = j + y[k];
            if(isValid(row , col , n , m) && grid[row][col]=='1' && vis[row][col]==false)
            dfs(grid , n ,m, row , col , vis);
        }
        return;
    }
    boolean isValid(int i , int j , int n , int m){
        if(i<0 || i>=n || j<0 || j>=m){
            return false;
        }
        return true;
    }
}