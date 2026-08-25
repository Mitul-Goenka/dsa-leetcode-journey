class Solution {
    public int removeElement(int[] nums, int val) {
       Stack<Integer> st = new Stack<>();
       for(int i=0;i<nums.length;i++){
        if(nums[i]==val){
            continue;
        }
        else{
            st.push(nums[i]);
        }
    }
    int count = st.size();
    int j=0;
    while(!st.isEmpty()){
        nums[j] = st.pop();
        j++;
    }

return count;
        
    }
}