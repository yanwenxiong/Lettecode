package com.tju.se.leetcode.array;

import java.util.*;

public class ThirdMaximumNumber {
	public int thirdMax(int[] nums) {
        int length = nums.length;
        if(length < 3){
        	if(length == 1) {
        		return nums[0];
        	}else if(length == 2){
        		return nums[0] > nums[1] ? nums[0] : nums[1];
        	}
        }
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
        	compareAndInsert(list,nums[i]);
        }
       if(list.size() != 3){
    	   return list.get(list.size()-1);
       }else{
    	   return list.get(0);
       }
    }

	private void compareAndInsert(List<Integer> list, int num) {
		int size = list.size();
		if(size == 0) {
			list.add(num);
		} else {
			int i;
			for(i = 0; i < size; i++) {
				if(list.get(i) == num)
					return;
				if(list.get(i) > num){
					break;
				}
			}
			if(size == 3) {
				if(i != 0) {
					list.remove(0);
					list.add(i-1,num);
				}
			}else{
				list.add(i,num);
			}
		}
		
	}
}
