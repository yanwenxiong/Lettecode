package com.tju.se.leetcode.array;

/**
 * https://leetcode.com/problems/min-cost-climbing-stairs/description/
 * @author YanWenXiong
 * create at 2018年1月10日 下午4:38:26
 */
public class MinCostClimbingStairs {
	public int minCostClimbingStairs(int[] cost) {
        if (cost == null || cost.length == 0) {
        	return 0;
        }
        int a = getRouteCost(0, cost);
        int b = getRouteCost(1, cost);
        return a > b ? b : a;
    }
	
	public int getRouteCost(int start, int[] cost) {
		int len = cost.length, sumCost = 0;
		for (int i = start; i < len; ) {
			sumCost += cost[i];
        	if (i == len - 1 || i == len - 2) {
        		break;
        	}
        	
        	if (cost[i + 1] >= cost[i + 2]) {
        		i += 2;
        	} else {
        		i++;
        	}
        }
		return sumCost;
	}
}
