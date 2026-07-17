package Blind75.SlidingWindow;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
      int maxProfit = Integer.MIN_VALUE;
      int minPrice = Integer.MAX_VALUE;
      for(int i=0;i<prices.length;i++){
          int currentStockPrice = prices[i];
          minPrice=Math.min(minPrice, currentStockPrice);
          int profit = currentStockPrice-minPrice;
          maxProfit=Math.max(profit, maxProfit);
      }
      return maxProfit;
    }
}
