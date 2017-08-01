package com.tju.se.leetcode;

import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray {
	public int findUnsortedSubarray(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		
		int[] newNums = new int[nums.length];
		for(int i = 0; i < nums.length; i++) {
			newNums[i] = nums[i];
		}
		Arrays.sort(newNums);
		
		int start = 0, end = nums.length-1;
		while(start <= nums.length-1 && nums[start] == newNums[start]) {
			start++;
		}
		while(end >= 0 && nums[end] == newNums[end]) {
			end--;
		}
		if(start >= end) {
			return 0;
		}
		return end - start + 1;
	}

	
}
