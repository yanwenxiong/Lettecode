package com.tju.se.leetcode;

import java.util.*;

public class InsertDeleteGetRandomO1 {

    /** Initialize your data structure here. */
	Map<Integer,Integer> map;
	List<Integer> list;
    public InsertDeleteGetRandomO1() {
        map = new HashMap<Integer,Integer>();
        list = new ArrayList<Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.get(val) == null){
        	map.put(val, val);
        	list.add(val);
        	return true;
        }else{
        	return false;
        }
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
    	 if(map.get(val) != null){
         	map.remove(val);
         	list.remove(new Integer(val));
         	return true;
         }else{
         	return false;
         }
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Random random = new Random(System.currentTimeMillis());
        System.out.println("size : " + map.size());
        return list.get(random.nextInt(map.size()));
    }
}
