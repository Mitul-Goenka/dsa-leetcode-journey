class Solution {
    public int fun(int[][] matrix, int n , int m , int guess){
        int row = n-1;
        int col = 0;
        int count = 0;
        while(row>=0 && col < m){
            if(matrix[row][col]<=guess){
                count += row+1;
                col++;
            }
            else{
                row--;
            }
        }
        return count;
    }
    public int kthSmallest(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int res = -1;

        int low = matrix[0][0];
        int high = matrix[rows-1][cols-1];

        while(low<=high){
            int guess = low + (high-low)/2;

            int ans = fun(matrix , rows , cols , guess);
            if(ans<k){
                low = guess + 1;
            }
            else{
                res = guess;
                high = guess-1;
            }
        }
        return res;
    }
}