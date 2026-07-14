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
        int right = nums.length-1;
        while(low<=right){
            int mid = low+(right-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        int low_1 = 0;
        int high_1 = high-1;
        while(low_1<=high_1){
            int mid = low_1 + (high_1-low_1)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                low_1 = mid+1;
            }
            else{
                high_1 = mid-1;
            }
        }
        return -1;
    }
}