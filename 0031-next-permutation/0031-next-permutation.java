class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        while(i>=0 && nums[i] >= nums[i+1]){
            i--;
        }
        if(i>=0){
            int j = nums.length-1;
            while(j >= 0 && nums[j]<=nums[i]) j--;
            swap(nums , i , j);
        }
        swap2(nums , i+1 , nums.length-1);
    }
    void swap(int nums[] , int a , int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    void swap2(int nums[] , int a , int b){
        while(a<b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
    }
}