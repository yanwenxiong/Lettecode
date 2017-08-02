package com.tju.se.leetcode;

public class MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
		int length = nums.length;
		int result = 0,tempRes = 0;
		for(int i = 0; i < length; i++){
			if(nums[i] == 1) {
				tempRes++;
			}
			if(i == length-1 || nums[i] == 0){
				if(result < tempRes){
					result = tempRes;
				}
				tempRes = 0;
			}
		}
		return result;
	}
}
