package com.tju.se.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindMedian {
	private List<Integer> list;
    /** initialize your data structure here. */
    public FindMedian() {
        list = new ArrayList<Integer>();
    }
    
    public void addNum(int num) {
    	int len = list.size();
    	if(len == 0 ){
    		list.add(num);
    	}else{
    		int i = 0;
    		for(i = 0; i < len; i++){
            	if(list.get(i).compareTo(num) > 0){
            		list.add(i, num);
            		break;
            	}
            }
    		if(i == len){
    			list.add(num);
    		}
    	}
    }
    
    public double findMedian() {
        int len = list.size();
        if(len <= 0){
        	return 0;
        }
        if(len % 2 == 1){
        	return list.get(len/2);
        }else{
        	return (list.get(len/2-1) + list.get(len/2)) * 1.0 / 2;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */