package com.tju.se.explore.array;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/22/
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        if (length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < length - 1; i++) {
            if (prices[i] < prices[i+1]) {
                sum += prices[i+1] - prices[i];
            }
        }
        return sum;
    }
}
