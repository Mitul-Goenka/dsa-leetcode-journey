class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        int maxSum = 0;
        int maxSubarray = cardPoints.length - k;
        int totalSum = 0;
        for(int i=0;i<cardPoints.length;i++){
            totalSum+=cardPoints[i];
        }
        for(int i=0;i<maxSubarray;i++){
            sum += cardPoints[i];
        }
        maxSum = sum;
        for(int i=maxSubarray;i<cardPoints.length;i++){
            sum += cardPoints[i] - cardPoints[i-maxSubarray];
            maxSum = Math.min(sum , maxSum);
        }
        return totalSum-maxSum;
    }
}