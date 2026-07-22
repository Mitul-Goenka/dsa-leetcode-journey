class Solution {
    public int maxProfit(int[] prices) {
        int price = Integer.MAX_VALUE;
        int maxPrice = 0;
        for(int i=0;i<prices.length;i++){
            price = Math.min(price , prices[i]);
            if(price < prices[i]){
                maxPrice = Math.max(maxPrice , prices[i]-price);
            }
        }
        return maxPrice;
    }
}