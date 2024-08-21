package src.StriverSDE;

public class StockBuySell {
    public static void main(String[] args) {
    int[] prices= {2,4,1};
    maxProfit(prices);
    }
    public static int maxProfit(int[] prices) {
        int mini= prices[0];
        int profit= 0;
        for(int i =1;i<prices.length;i++){
            int cost = prices[i]-mini;
            profit= Math.max(profit,cost);
            mini= Math.min(mini,prices[i]);
        }
return profit;}
}
