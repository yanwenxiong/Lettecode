package com.tju.se.leetcode;

import java.util.Arrays;

public class MaximumProductofThreeNumbers {
	public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int prop1 = nums[len-1] * nums[len-2] * nums[len-3];
        int prop2 = nums[0] * nums[1] * nums[len-1];
        return (prop1 > prop2 ? prop1 : prop2);
    }
}
