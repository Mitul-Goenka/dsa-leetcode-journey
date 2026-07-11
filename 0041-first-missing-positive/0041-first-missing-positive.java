class Solution {
    public void swapNumbers(int[] nums , int left , int right){
       int temp = nums[left];
       nums[left] = nums[right];
       nums[right] = temp;

    }
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){          
            int x = nums[i];
            while(x>0 && x<=n && nums[x-1]!=x){
                swapNumbers(nums , i , x-1);
                x = nums[i];
            }
        }  
        for(int i=0;i<n;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
            else{
                continue;
            }
        } 
        return n+1;
    }
}