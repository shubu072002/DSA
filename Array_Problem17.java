public class Array_Problem17 {
    public static int maxProfit(int[] prices){
        if(prices.length==0 || prices.length==1 ){
            return 0;
        }
            int min=prices[0];
            int profit=0;
            int max = 0;
            for(int i=0;i<prices.length;i++){
                min = Math.min(min,prices[i]);
                profit = prices[i]-min;
                max = Math.max(max,profit);
            }
            return max;
        }


    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("The maximum profit: "+maxProfit(prices));

    }
}
