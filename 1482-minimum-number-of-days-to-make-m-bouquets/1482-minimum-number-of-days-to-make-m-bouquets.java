class Solution {
    public boolean canMake(int[] bloomDay , int m, int k , int day){
        int bouquets = 0;
        int count = 0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i] <= day){
                count++;
                if(count==k){
                    bouquets++;
                    count = 0;
                }
            }
                else{
                    count = 0;
                }
        }
        return bouquets>=m;

    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k>bloomDay.length){
            return -1;
        }
        int low = 0;
        int high = 0;
        int res = -1;
        for(int i=0;i<bloomDay.length;i++){
            low = Math.min(low , bloomDay[i]);
            high = Math.max(high , bloomDay[i]);
        }
        while(low<=high){
            int guess = low + (high-low)/2;

            if(canMake(bloomDay , m , k , guess)){
                res = guess;
                high = guess-1;
            }
            else{
                low = guess+1;
            }
        }
        return res;
    }
}