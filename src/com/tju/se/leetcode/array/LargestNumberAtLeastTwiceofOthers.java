package com.tju.se.leetcode.array;

/**
 * https://leetcode.com/problems/largest-number-at-least-twice-of-others/description/
 * @author YanWenXiong
 * create at 2018年1月10日 下午4:23:55
 */
public class LargestNumberAtLeastTwiceofOthers {
	public int dominantIndex(int[] nums) {
		if (nums == null || nums.length <= 0) {
			return -1;
		}
		int max = 0, secondMax = 0, maxIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if (max < nums[i]) {
				secondMax = max;
				max = nums[i];
				maxIndex = i;
			} else {
				if (secondMax < nums[i] && max != nums[i]) {
					secondMax = nums[i];
				}
			}
		}
		System.out.println(max + " " + secondMax);
		return (max >= secondMax * 2) ? maxIndex : -1;
	}
}
