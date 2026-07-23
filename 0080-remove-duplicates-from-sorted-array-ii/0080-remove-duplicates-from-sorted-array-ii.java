class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        while(j<nums.length){
            if(i>=1 && nums[j]==nums[i] && nums[j]==nums[i-1]){
                j++;
            }
            else{
                nums[i+1] = nums[j];
                j++;
                i++;
            }
        }
        return i+1;
    }
}