package com.tju.se.leetcode.array;

public class MissingNumber {
	public int missingNumber(int[] nums) {
        int sum = 0, length = nums.length;
        for(int i = 0; i < length; i++) {
        	sum += nums[i];
        }
        return length*(length+1)/2 - sum;
    }
}
