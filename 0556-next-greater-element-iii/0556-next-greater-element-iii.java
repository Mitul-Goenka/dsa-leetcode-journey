class Solution {
    public int nextGreaterElement(int n) {
        int y = n;
        int x = n;
        int count = 0;
        if(x==0) count=1;
        else{
        while(x>0){
            x = x/10;
            count++;
        }
    }
        int[] arr = new int[count];
        for(int i=arr.length-1;i>=0;i--){
            int b = n%10;
            n = n/10;
            arr[i] = b;
        }
        int i = arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        if(i>=0){
            int j = arr.length-1;
            while(j>=0 && arr[j]<=arr[i]) j--;
            swap(arr , i , j);
        }
        swap2(arr , i+1 , arr.length-1);
        long sum = 0;
        for(int f=0;f<arr.length;f++){
            sum = sum*10+arr[f];
        }
        if(sum>y && sum <= Integer.MAX_VALUE){
            return (int)sum;
        }
        return -1;
    }
    void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    void swap2(int[] arr , int a , int b){
        while(a<b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
}