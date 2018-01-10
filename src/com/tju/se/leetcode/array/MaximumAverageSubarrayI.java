package com.tju.se.leetcode.array;

public class MaximumAverageSubarrayI {
	public double findMaxAverage(int[] nums, int k) {
        int length = nums.length,num = length - k + 1;
        int sum = 0,tempSum = 0;
        for(int i = 0; i < k; i++){
        	sum += nums[i];
        }
        tempSum = sum;
        
        for(int i = 0; i < num; i++){
        	if(i != num-1){
        		tempSum = tempSum - nums[i] + nums[i+k];
        		if(tempSum > sum)
        			sum = tempSum;
        	}
        }
        return sum * 1.0 / k;
    }
}
