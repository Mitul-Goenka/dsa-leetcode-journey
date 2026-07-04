class Solution {
    // public int findRight(int[] nums){
    //     int low = 0;
    //     int high = nums.length - 1;
    //     int res = nums[0];
    //     int ans = nums[0];
    //     while(low<=high){
    //       int mid = low+(high-low)/2;
    //       if(nums[mid]<ans){
    //         ans = nums[mid];
    //         low ++;
    //       }
    //       else{
    //         high --;
    //       }
    //       res = Math.min(res , ans);
    //     }
        
    //     return res;
    // }
    // public int findLeft(int[] nums){
    //     int low = 0;
    //     int high = nums.length - 1;
    //     int res = nums[0];
    //     int ans = nums[0];
    //     while(low<=high){
    //       int mid = low+(high-low)/2;

    //       if(nums[mid]<ans){
    //         ans = nums[mid];
    //         high--;
    //       }
    //       else{
    //         low++;
    //       }
    //       res = Math.min(res,ans);
    //     }
    //     return res;
    // }
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(nums[mid]>nums[high]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return nums[low];       
    }
}