package com.tju.se.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		
		int temp;
		for(int i = 0; i < nums.length; i++) {
			temp = Math.abs(nums[i])-1;
			if(nums[temp] > 0){
				nums[temp] = -nums[temp];
			}
		}
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > 0){
				list.add(i+1);
			}
		}
		return list;
	}
}
