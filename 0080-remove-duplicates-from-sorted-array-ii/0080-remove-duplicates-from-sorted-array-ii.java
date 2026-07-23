class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        int count=1;
        int a=0;
        while(j<nums.length){
            if(i>=1 && nums[j]==nums[i] && nums[j]==nums[i-1]){
                j++;
            }
            else{
                nums[i+1] = nums[j];
                count++;
                j++;
                i++;
            }
        }
        return count;
    }
}