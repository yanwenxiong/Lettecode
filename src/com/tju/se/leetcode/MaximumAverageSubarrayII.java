package com.tju.se.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumAverageSubarrayII {
	public double findMaxAverage(int[] nums, int k) {
		int length = nums.length, times = length-k+1;
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
		int sum = 0; int oldk = k;
		for(int i = 0; i < k; i++){
			sum += nums[i];
		}
		list.add(sum);
        for(int i = 0; i < times-1; i++) {
        	sum = sum - nums[i] + nums[i+k];
        	list.add(sum);
        }
        map.put(k, list);
        k++;
        	
        while(k <= length){
        	List<Integer> klist = new ArrayList<Integer>();
        	for(int i = 0; i < length - k + 1; i++) {
            	klist.add(map.get(k-1).get(i) + nums[i+k-1]);
            }
        	map.put(k,klist);
        	k++;
        }
        
        double res = maxInList(map.get(oldk)) * 1.0 / oldk;
        for(Map.Entry<Integer,List<Integer>> entry : map.entrySet()) {
        	int temp = maxInList(entry.getValue());
        	if(res < temp * 1.0 / entry.getKey()){
        		res = temp * 1.0 / entry.getKey();
        	}
        }
        return res;
    }
	
	private int maxInList(List<Integer> list){
		int max = list.get(0);
		for(Integer i : list) {
			if(max < i)
				max = i;
		}
		return max;
	}
}
