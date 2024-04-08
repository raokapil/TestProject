package com.company.LeetCode.Array;

public class BestTimeToBuySellStock {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            // Calculate the profit for buying on the previous day and selling today
            int profit = prices[i] - prices[i - 1];
            // Update maxProfit if the current profit is greater
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }


    public static int maxProfitOpt(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price); // Update min price seen so far
            maxProfit = Math.max(maxProfit, price - minPrice); // Update max profit based on current price and min price
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(prices);

        int maxProfitOpt = maxProfitOpt(prices);
        System.out.println("Maximum profit possible: " + maxProfit + ", maxProfitOpt : " + maxProfitOpt);
    }
}
