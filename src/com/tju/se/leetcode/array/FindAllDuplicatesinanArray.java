package com.tju.se.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesinanArray {
	public List<Integer> findDuplicates(int[] nums) {
        int length = nums.length;
        List<Integer> list = new ArrayList<Integer>();
        int temp;

        for (int i = 0; i < length; i++) {
        	temp = Math.abs(nums[i])-1;
        	if(nums[temp] > 0)
        		nums[temp] = -nums[temp];
        }
        for(int i = 0; i < length; i++) {
        	nums[i] = - nums[i];
        }
        for (int i = 0; i < length; i++) {
        	temp = Math.abs(nums[i])-1;
        	nums[temp] = -nums[temp];
        }
        
        for (int i = 0; i < length; i++) {
        	if(nums[i] > 0)
        		list.add(i+1);
        }
        return list;
    }
}
