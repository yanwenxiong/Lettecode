package com.tju.se.leetcode.array;

public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		int i;
		for(i = 0 ; i < nums.length; i++) {
			if(target <= nums[i]){
				return i;
			}
		}
		return nums.length;
	}
}
