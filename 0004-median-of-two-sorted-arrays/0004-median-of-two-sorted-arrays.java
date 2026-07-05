class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] nums = new int[n];
        for(int i=0;i<nums1.length;i++){
            nums[i] = nums1[i];
        }
        for(int i = 0 , j=nums1.length ; i<nums2.length && j<n;i++,j++){
            nums[j] = nums2[i];
        }
        Arrays.sort(nums);
        int idx = n/2;
        double median;
        if(n%2==0){
            median = (double)(nums[(n/2)]+nums[(n/2)-1])/2;
        }
        else{
            median = (double)nums[idx];
        }
        return median;

        
    }
}