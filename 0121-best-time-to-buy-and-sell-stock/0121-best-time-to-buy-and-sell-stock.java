class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<prices.length;i++){
            int currPrice = prices[i];
            minPrice = Math.min(minPrice, currPrice);

            int profit = currPrice - minPrice;
            max = Math.max(profit, max);
        }
        return max;
    }
}