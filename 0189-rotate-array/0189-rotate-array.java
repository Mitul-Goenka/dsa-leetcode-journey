class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int j=0;
        int i = nums.length-1;
        while(j<i){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            j++;
            i--;
        }
        int x = 0;
        int y = k-1;
        while(x<y){
            int temp = nums[x];
            nums[x] = nums[y];
            nums[y] = temp;
            x++;
            y--;
        }
        int a = k;
        int b = nums.length-1;
        while(a<b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
    }
}