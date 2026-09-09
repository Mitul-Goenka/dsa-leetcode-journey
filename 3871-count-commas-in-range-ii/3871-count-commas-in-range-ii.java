class Solution {
    public long countCommas(long n) {
        long start = 1000;
        long ans = 0;
        long comma = 1;
        while(start<=n){
            long end;
            if(start > n/1000){
                end = n;
            }
            else{
                end = start * 1000 - 1;
            }
            ans += (end - start + 1) * comma;
            if(start>Long.MAX_VALUE){
                break;
            }
            start *= 1000;
            comma++;
        }
        return ans;
    }
}