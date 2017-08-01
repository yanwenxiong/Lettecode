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
        Map<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
        add(map,new ArrayList<Integer>(),-1);
        for(int i = 0; i < length; i++) {
        	List<Integer> indexList = new ArrayList<Integer>();
        	int tempIndex = i; int followCount;
        	indexList.add(i);
        	while(notCircle(indexList,nums[tempIndex])) {
        		followCount = find(map,tempIndex,indexList);
        		if(followCount != -1) {
        			break;
        		}else {
        			tempIndex = nums[tempIndex];
        		}
        	}
        	add(map,indexList,i);
        }
        
        int res = 0;
        for(Entry<Integer,List<Integer>> entry : map.entrySet()) {
        	res = entry.getValue().size();
        	break;
        }
        return res;
    }
	
	private boolean notCircle(List<Integer> list, int i){
		for(Integer integer : list) {
			if(integer.equals(i)){
				return false;
			}
		}
		list.add(i);
		return true;
	}
	
	
	private void add(Map<Integer,List<Integer>> map, List<Integer> temp, int key) {
		if(map.isEmpty()) {
			map.put(key,temp);
		}
		for(Entry<Integer, List<Integer>> entry : map.entrySet()) {
			if(entry.getValue().size() < temp.size()) {
				map.clear();
				map.put(key,temp);
				return;
			} else if (entry.getValue().size() == temp.size()) {
				map.put(key, temp);
				return;
			} else {
				return;
			}
		}
	}
	
	private int find(Map<Integer,List<Integer>> map, int key, List<Integer> newList) {
		for (Entry<Integer,List<Integer>> entry : map.entrySet()) {
			if (entry.getKey().equals(key)) {
				List<Integer> oldList = entry.getValue();
				for(int i = 0; i < newList.size()-1; i++) {
					for (int j = 1; j < oldList.size(); j++) {
						if(newList.get(i).equals(oldList.get(j)))
							return j-1+newList.size();
					}
				}
				return newList.size() + oldList.size() - 1;
				
			}
		}
		return -1;
	}
}
