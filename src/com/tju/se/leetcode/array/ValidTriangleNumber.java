package com.tju.se.leetcode.array;

import java.util.Arrays;

public class ValidTriangleNumber {
	public int triangleNumber(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1 && nums[i] != 0; j++) {
            	for(int k = j+1; k < nums.length; k++){
            		if(nums[i] + nums[j] > nums[k]){
            			count++;
            		}else{
            			break;
            		}
            	}
            }
        }
        return count;
    }
}
