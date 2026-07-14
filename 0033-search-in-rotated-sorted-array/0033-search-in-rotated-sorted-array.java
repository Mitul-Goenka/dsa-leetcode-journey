class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(nums[mid]<nums[high]){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        int left = 0;
        int right = 0;
        if(high == 0){
         left = 0;
         right = nums.length-1;
        }
        else if(nums[0]<=target){
            right = high-1;
        }
        else{
            left = high;
            right = nums.length-1;
        }
        while(left<=right){
            int mid = left+(right-left)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
}