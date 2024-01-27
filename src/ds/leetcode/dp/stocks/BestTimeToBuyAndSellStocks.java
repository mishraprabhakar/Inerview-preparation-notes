package ds.leetcode.dp.stocks;

public class BestTimeToBuyAndSellStocks {

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        int profit = maxProfit(prices);
        System.out.println(profit);
    }

    private static int maxProfit(int[] prices) {

        int profit = 0;

        int min = prices[0];

        for(int i = 1; i < prices.length; i++) {

            profit = Integer.max(profit, prices[i]-min);
            min = Integer.min(min, prices[i]);              //Remembering Past therefor DP is used
        }

        return profit;
    }
}
