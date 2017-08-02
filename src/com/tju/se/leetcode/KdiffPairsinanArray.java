package com.tju.se.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class KdiffPairsinanArray {
	public int findPairs(int[] nums, int k) {
		int length = nums.length;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		Arrays.sort(nums);
		for(int i = 0; i < length; i++) {
			for(int j = i + 1; j < length; j++) {
				int a = nums[i], b = nums[j], distance = b - a;
				if(distance > k){
					break;
				}else if(b-a == k){
				    map.put(a, b);
				}
			}
		} 
        return map.size();
    }
	
}
