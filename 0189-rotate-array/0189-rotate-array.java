class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int n = nums.length;
        int[] arr = new int[n];
        int i = n - k;
        int j = 0;
        while(j < k){
            arr[j] = nums[i];
            i++;
            j++;
        }
        int x = 0;
        int y = k;
        while(y < n){
            arr[y] = nums[x];
            x++;
            y++;
        }
        for(int m=0;m<n;m++){
            nums[m] = arr[m];
        }
    }
}