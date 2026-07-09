class Solution {
    public int fun(int m , int n , int guess , int k){
        int row = 1;
        int col = n;
        int count = 0;
        while(row<=m && col>=1){
            if(col <= guess/row){
                count += Math.min(n , guess/row);
                row++;
            }
            else{
                col--;
            }
        }
        
        return count;
    }
    public int findKthNumber(int m, int n, int k) {
        int low = 1;
        int high = m*n;
        int res = -1;
        while(low<=high){
            int guess = low+(high-low)/2;
            int ans = fun(m , n , guess , k);
            if(ans<k){
                low = guess+1;
            }
            else{
                res = guess;
                high = guess-1;
            }
        }
        return res;
    }
}