class Solution {
    public int maxProfit(int[] prices) {
        int price = Integer.MAX_VALUE;
        int maxProfit = 0;
        int idx = 0;
        for(int i=0;i<prices.length;i++){
            price = Math.min(price , prices[i]);
            if(price < prices[i]){
                maxProfit += prices[i]-price;
                price = prices[i];
            }
        }

        return maxProfit;
    }
}