class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int m = isConnected[0].length;
        boolean[] vis = new boolean[n];
        int res = 0;
        int i;
        for(i=0;i<n;i++){
                if(vis[i]==false){
                    dfs(isConnected , n , m , i, vis);
                    res++;
                }
            
        }
        return res;
    }
    void dfs(int[][] isConnected , int n , int m , int i, boolean[] vis){
        vis[i] = true;
        for(int k=0;k<n;k++){
            if(isConnected[i][k]==1 && vis[k]==false){
                vis[k] = true;
                dfs(isConnected , n , m , k, vis);
            }
        }
        return;
    }
}