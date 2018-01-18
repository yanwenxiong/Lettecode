package com.tju.se.leetcode.array;

/**
 * https://leetcode.com/problems/find-pivot-index/description/
 * @author YanWenXiong
 * create at 2018年1月18日 上午9:44:35
 */
public class FindPivotIndex {
	public int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
        	return -1;
        }
        int leftSum = 0, rightSum = 0;
        for (int i = 1; i < nums.length; i++) {
        	rightSum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
        	if (leftSum == rightSum) {
        		return i;
        	} else {
        		leftSum += nums[i];
        		if (i + 1 < nums.length)
        			rightSum -= nums[i + 1];
        	}
        }
        return -1;
    }
}
