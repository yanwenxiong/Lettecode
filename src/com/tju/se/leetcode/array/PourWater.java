package com.tju.se.leetcode.array;

/**
 * https://leetcode.com/problems/pour-water/description/
 * @author YanWenXiong
 * create at 2018年1月10日 下午12:27:47
 */
public class PourWater {
	public int[] pourWater(int[] heights, int V, int K) {
        if (heights == null || heights.length == 0) {
        	return new int[0];
        }
        int target = 0;
        for (int i = 1; i <= V; i++) {
        	target = findLeftIndex(K, heights);
			if (target < K) {
				heights[target] = heights[target] + 1;
				continue;
			} else {
				target = findRightIndex(K, heights);
				heights[target] = heights[target] + 1;
				continue;
			}
        }
        return heights;
    }
	
	public int findLeftIndex(int index, int[] result) {
		int target = index;
		for (int j = index; j >= 0; j--) {
			if (result[target] > result[j]) {
				target = j;
			}
			if (j != 0) {
				if (result[j] < result[j - 1]) {
					break;
				}
			}
		}
		return target;
		
	}
	
	public int findRightIndex(int index, int[] result) {
		int target = index;
		for (int j = index; j < result.length; j++) {
			if (result[target] > result[j]) {
				target = j;
			}
			if (j != result.length - 1) {
				if (result[j] < result[j + 1]) {
					break;
				}
			}
		}
		return target;
	}
}
