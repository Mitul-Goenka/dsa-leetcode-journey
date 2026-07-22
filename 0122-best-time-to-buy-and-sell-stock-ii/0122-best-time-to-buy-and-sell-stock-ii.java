class Solution {
    public int maxProfit(int[] prices) {
        int price = Integer.MAX_VALUE;
        int maxProfit = 0;
        int idx = 0;
        for(int i=1;i<prices.length;i++){
            price = Math.min(price , prices[i]);
            if(prices[i] > prices[i-1]){
                maxProfit += prices[i]-prices[i-1];
            }
        }
        return maxProfit;
    }
}