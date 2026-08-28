class Solution {
    public long cal(long x , long sum){
        if(x==0){
            return sum;
        }
        long rem = x%10;
        sum = sum*10+rem;
        
        return cal(x/10 , sum);
        }
    
    public int reverse(int x) {
        long ans = cal(x , 0);
        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE){
            return 0;
        }
        return (int)ans;
    }
}