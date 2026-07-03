class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low<=high){
            int i = low + (high-low)/2;
            if(nums[i]==target){
                return i;
            }
            else if(nums[i]<target){
                low = i+1;
            }
            else{
                high = i-1;
            }
        }
        return -1;
    }
}