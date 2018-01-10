package com.tju.se.leetcode.array;

public class SlidingWindowMaximum {
	public int[] maxSlidingWindow(int[] nums, int k) {
		int length = nums.length,times = length-k+1;
		int[] result = new int[times];
		//the problem description don't asked me to judge the length,but it needs indeed.
		if(length == 0) {
			result = new int[0];
			return result;
		}
		for(int i = 0; i < times; i++) {
			result[i] = this.max(nums,i,i+k-1);
		}
        return result;
    }
	
	private int max(int[] arr,int start, int end) {
		int max = arr[start];
		for(int i = start; i <= end; i++) {
			if(max < arr[i])
				max = arr[i];
		}
		return max;
	}
}
