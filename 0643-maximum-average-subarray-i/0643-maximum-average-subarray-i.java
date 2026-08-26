class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low = 0;
        int high = 0;
        double sum = 0;
        double avg = 0;
        for(high=0;high<k;high++){
            sum+=nums[high];
        }
        avg = sum/k;
        double max_avg=avg;
        for(high=k;high<nums.length;high++){
            sum = sum-nums[low]+nums[high];
            avg = sum/k;
            max_avg = Math.max(max_avg , avg);
            low++;
        }
        return max_avg;
    }
}