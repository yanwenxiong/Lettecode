package com.tju.se.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SubarraySumEqualsK {
	public int subarraySum(int[] nums, int k) {
		int count = 0;
		for(int i = 0 ; i < nums.length; i++) {
			List<Integer> list = new ArrayList<Integer>();
			int floor = 0;
			while(floor <= i){
				int temp;
				if(floor == 0) {
					temp = nums[i];
				} else {
					temp = list.get(floor-1) + nums[i-floor];
				}
				if (temp == k) {
					count++;
				} 
				list.add(temp);
				floor++;
			}
		}
		return count;
    }
}
