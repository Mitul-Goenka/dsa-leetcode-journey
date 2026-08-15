class Solution {
    public int fib(int n) {
        int[] arr = new int[n+1];
        for(int i=0;i<n+1;i++){
            arr[i] = i;
            if(i>1){
                arr[i] = arr[i-1]+arr[i-2];
            }
        }
        return arr[n];

        
    }
}