class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result_sum = nums[0]+nums[1]+nums[2];
        int max_diff = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                sum = nums[i]+nums[left]+nums[right];
                int diff = Math.abs(sum-target);
                if(diff<max_diff){
                    max_diff = diff;
                    result_sum = sum;
                }
                if(sum==target){
                    return sum;
                }
                else if(sum>target){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return result_sum;
    }
}