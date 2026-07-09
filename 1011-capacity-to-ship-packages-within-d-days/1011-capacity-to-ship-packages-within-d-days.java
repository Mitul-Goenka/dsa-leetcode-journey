class Solution {
    public boolean canShip(int[] weights, int guess , int days){
        int count = 1;
        int weight = 0;
        for(int i=0;i<weights.length;i++){
            weight += weights[i];
            if(weight > guess){
                weight = weight-weights[i];
                count++;
                weight = weights[i];
                }      
            else{
                continue;
            }
        }
        return count<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int high = 0;
        int low = Integer.MIN_VALUE;
        for(int i=0;i<weights.length;i++){
            low = Math.max(low , weights[i]);
            high += weights[i]; 
        }
        while(low<=high){
            int guess = low + (high-low)/2;
            if(canShip(weights , guess , days)){
                high = guess-1;
            }
            else{
                low = guess+1;
            }
        }
        return low;
    }
}