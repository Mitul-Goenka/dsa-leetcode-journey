class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[st.peek()]){
                st.push(i);
            }
        }
        return st.peek();
        
    }
}