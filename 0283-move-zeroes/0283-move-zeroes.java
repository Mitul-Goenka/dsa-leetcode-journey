class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length<=1){
            return;
        }
        int pos = 0;
        int zero = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[pos] = nums[i];
                pos++;
            }
            else {
                zero++;
            }
        }
        for(int i=nums.length-zero;i<nums.length;i++){
            nums[i] = 0;
        }
    }
}