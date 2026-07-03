class Solution {
    public int findLeft(int[] nums , int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                 ans = mid;
                high = mid-1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
    public int findRight(int[] nums , int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                ans = mid;
                low = mid+1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int[] res = new int[nums.length];
        int ans = 0;
        while(low<=high){
            int i = low + (high-low)/2;

             if(nums[i]>target){
                high = i-1;
            }
            else if(nums[i]<target){
                low = i+1;
            }
            else{
                int first = findLeft(nums, target);
                int last = findRight(nums , target);
                return new int[]{first , last};
            }

        }
        return new int[]{-1,-1};
    }
}