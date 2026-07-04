class Solution {
    public int turningPoint(int[] nums){
        int low = 0;
        int high = nums.length - 1;
        while(low<high){
            int mid = low + (high-low)/2;

            if(nums[mid]>nums[high]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int pivot =  turningPoint(nums);
        int res = -1;
         if(target >= nums[pivot] && target <= nums[high]){
                 low = pivot;
            }
            else{
                high = pivot - 1;
            }
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
           else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return res;
    }
}