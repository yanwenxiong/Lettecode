package com.tju.se.leetcode.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SlidingWindowMedian {
	public double[] medianSlidingWindow(int[] nums, int k) {
		int len = nums.length-k+1;
		double[] result = new double[len];

		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < k; i++) {
			list.add(nums[i]);
		}
		Collections.sort(list);
		for(int i = 0; i < len; i++){
			result[i] = median(list,k);
			if(i != len-1){
				list.remove(new Integer(nums[i]));
				int j = 0;
				for(j = 0; j < k-1; j++) {
					if(nums[i+k] < list.get(j)){
						list.add(j, nums[i+k]);
						break;
					}
				}
				if(j == k-1){
					list.add(nums[i+k]);
				}
			}
		}
		return result;
	}
	
	private double median(List<Integer> list,int offset) {
		if (offset % 2 == 1) {
			return list.get(offset / 2);
		} else {
			return list.get(offset / 2 - 1) * 1.0 / 2 + list.get(offset / 2) * 1.0 / 2;
		}
	}
}
