package Blind150.DynamicProgramming;

public class BestTimeToBuyAndSell2 {
    // without dp
//    public int maxProfit(int[] prices) {
//        int prof = 0;
//        for(int i=1;i<prices.length;i++){
//            if(prices[i]>prices[i-1]){
//                prof+=prices[i]-prices[i-1];
//            }
//        }
//        return prof;
//    }

    // with dp
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n+1][2];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return helper(prices,0,1,dp);
    }
    public int helper(int[] prices, int idx, int buyOrSell, int[][] dp){
        if(idx==prices.length){
            return 0;
        }
        int profit =0;
        if(dp[idx][buyOrSell]!=-1){
            return dp[idx][buyOrSell];
        }
        if(buyOrSell==1){
            int buy = -prices[idx]+helper(prices, idx+1, 0,dp);
            int skip = 0 + helper(prices, idx+1, 1,dp);
            profit = Math.max(buy,skip);
        }
        else{
            int sell = prices[idx]+helper(prices, idx+1, 1,dp);
            int skip = 0 + helper(prices, idx+1, 0,dp);
            profit=Math.max(sell,skip);
        }
        return dp[idx][buyOrSell] = profit;
    }


}
