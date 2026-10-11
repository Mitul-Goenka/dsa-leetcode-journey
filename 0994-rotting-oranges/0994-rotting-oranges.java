class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int time = 0;
        Queue<Pair> q = new LinkedList<>();
        int fresh = 0;
        int i ,j;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(grid[i][j] == 2){
                    q.add(new Pair(i , j));
                    grid[i][j] = -2;
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        while(!q.isEmpty() && fresh>0){
            time++;
            int s = q.size();
            while(s>0){
                Pair p = q.remove();
                int row = p.r;
                int col = p.c;
                for(int k=0;k<4;k++){
                    int row1 = row + x[k];
                    int col1 = col + y[k];
                    if(isValid(row1 , col1 , n , m ) && grid[row1][col1]==1){
                        q.add(new Pair(row1 , col1));
                        grid[row1][col1] = -2;
                        fresh--;
                    }
                }
                s--;
            }
        }
        if(fresh>0){
            return -1;
        }
        return time;

    }
    int[] x = {-1 , 1 , 0 , 0};
    int[] y = {0 , 0 , -1 , 1};
    boolean isValid(int i , int j , int n , int m){
        if(i<0 || i>=n || j<0 || j>=m){
            return false;
        }
        return true;
    }

class Pair{
    int r;
    int c;
    Pair(int r , int c){
        this.r = r;
        this.c = c;
    }
}
}