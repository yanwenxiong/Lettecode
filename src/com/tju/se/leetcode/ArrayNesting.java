package com.tju.se.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ArrayNesting {
	public int arrayNesting(int[] nums) {
        int length = nums.length;
        if(length == 0) return 0;

        int[] record = new int[length];
        for(int i = 0; i < length; i++) {
        	record[i] = 0;
        }
        Map<Integer, List<Integer>> map = new HashMap<Integer,List<Integer>>();
        
        int start;
        while((start = findNotFull(record)) != -1) {
        	List<Integer> list = new ArrayList<Integer>();
        	list.add(start);
        	record[start]++; 
        	while(notCircle(list,nums[start])){
        		list.add(nums[start]);
        		start = nums[start];
        		record[start]++; 
        	}
        	map.put(start, list);
        }

        int result = 0;
        for(Entry<Integer, List<Integer>> entry : map.entrySet()){
        	if(result < entry.getValue().size()){
        		result = entry.getValue().size();
        	}
        }
        return result;
    }
	
	private int findNotFull(int[] nums) {
 		for(int i = 0; i < nums.length; i++) {
 			if(nums[i] == 0)
 				return i;
 		}
 		return -1;
	}
	
	private boolean notCircle(List<Integer> list, int num) {
		for(Integer integer : list) {
			if(integer.equals(num)) {
				return false;
			}
		}
		return true;
	}
	
}
