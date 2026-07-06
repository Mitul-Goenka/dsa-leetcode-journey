class Solution {
    public long fun(int[] piles , int h , int speed){
        long time = 0;
        for(int i=0;i<piles.length;i++){
            time += piles[i]/speed;
            if(piles[i]%speed != 0){
                time++;
            }
        }
        return time;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int i=0;i<piles.length;i++){
            high = Math.max(piles[i] , high);
        }
        int res = -1;
        while(low <= high){
            int guess = low+(high-low)/2;
            long hour = fun(piles , h , guess);
            if(hour<=h){
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