package com.tju.se.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskScheduler {
	public int leastInterval(char[] tasks, int n) {
        int[] all = new int[26];
        for(int i = 0; i < 26; i++) {
        	all[i] = 0;
        }
        for(int i = 0; i < tasks.length; i++){
        	int temp = tasks[i] - 'A';
        	all[temp]++;
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 25; i >= 0; i--){
        	if(all[i] > 0){
        		list.add(all[i]);
        	}
        }
        Collections.sort(list);
        
        int count = 0;
        int temp = 0;
        while(!list.isEmpty()){
        	temp = 0;
        	for(int i = list.size()-1; i >= 0; i--){
    			temp++;
    			if(list.get(i) == 1){
    				list.remove(i);
    			}else{
    				list.set(i, list.get(i)-1);
    			}
        		if(temp == n+1){
        			break;
        		}
        	}
        	Collections.sort(list);
        	count += (n+1);
        }
        count -= (n+1-temp);
        return count;
    }
}
