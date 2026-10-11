class Solution {
    public int sumOfSquares(int[] nums) {
        int sq = 0;
        int n = nums.length;
        for(int i=1;i<=n;i++){
           if((n%i)==0){
            sq += nums[i-1] * nums[i-1];
           }
        }
        return sq ;
    }
}