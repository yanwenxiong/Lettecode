package com.tju.se.leetcode.array;

public class MoveZeroes {
	 public void moveZeroes(int[] nums) {
	     int length = nums.length;
	     
	     int nextOn = 0;
	     for (int i = 0; i < length; i++) {
	    	 if (nums[i] != 0) {
	    		 nums[nextOn] = nums[i];
	    		 nextOn++;
	    	 }
	     }
	     for(int i = nextOn; i < length; i++) {
	    	 nums[i] = 0;
	     }
	 }
}
