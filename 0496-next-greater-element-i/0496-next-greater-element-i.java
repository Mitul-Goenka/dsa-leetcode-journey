class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
            int i=0;
            int j=0;
            while(i<nums1.length){
                j = 0;
            while(j<nums2.length){
                if(nums1[i]==nums2[j]){
                    int n = j;
                    int x = st.size();
                    while(n<nums2.length){
                        if(nums2[n]>nums1[i]){
                            st.push(nums2[n]);
                            break;
                        }
                        n++;              
                    }
                    if(st.size()==x){
                        st.push(-1);
                    }
                    break;
                }
                else{
                    j++;
                }
            }
            i++;
        }
            int[] nums = new int[nums1.length];
            for(int k=nums.length-1;k>=0;k--){
                nums[k] = st.pop();
            }
            return nums;
    }
}