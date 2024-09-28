package src.lc;

import java.util.Arrays;

public class BestTimeToBuySell {
    public static void main(String[] args) {
        int[] prices ={10,4,5,7,8,10,3,9};
        maxProfit(prices);
    }
    public static int maxProfit(int[] prices) {
        int min = prices[0], max=0;
        int len = prices.length;
        int index=0;
        int profit=0;
     for (int i =0; i<len;i++){
             if (prices[i]<min){
                 min=prices[i];
                 index=i;
             }
              profit=Math.max(profit,prices[i]-min);
          }
     for (int i=index+1;i<len;i++){
         if(prices[i]>max){
             max=prices[i];
         }
         }


        System.out.println(profit);

        return profit;
    }
    }

