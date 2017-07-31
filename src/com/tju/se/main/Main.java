package com.tju.se.main;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import com.tju.se.leetcode.Battleships;
import com.tju.se.leetcode.FindMedian;
import com.tju.se.leetcode.MaximumAverageSubarrayI;
import com.tju.se.leetcode.SearchInsertPosition;
import com.tju.se.leetcode.SlidingWindowMedian;

public class Main {

	public static void main(String[] args) {
		/*Battleships battleships = new Battleships();
		char[][] board = {
				{'.','X','.','.','X'},
				{'.','X','.','.','X'},
				{'.','.','.','.','X'},
				{'X','.','X','X','.'},
				{'X','.','.','.','X'}
			};
		{
				{'X','.','.','X'},
				{'.','.','.','X'},
				{'.','.','.','X'}
		};
		System.out.println(battleships.countBattleships(board));*/
		
		/*FindMedian findMedian = new FindMedian();
		findMedian.addNum(-1);
		findMedian.addNum(-2);
		System.out.println(findMedian.findMedian());*/
		
		/*int[] nums = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		SlidingWindowMedian bean = new SlidingWindowMedian();
		double[] result = bean.medianSlidingWindow(nums, k);
		for(double d : result){
			System.out.print(d + " ");
		}*/
		
		/*int[] nums = {1,3,5,6};
		SearchInsertPosition bean = new SearchInsertPosition();
		System.out.println(bean.searchInsert(nums, 5));
		System.out.println(bean.searchInsert(nums, 2));
		System.out.println(bean.searchInsert(nums, 7));
		System.out.println(bean.searchInsert(nums, 0));*/
		
		int[] nums = {1,12,-5,-6,50,3};
		int[] nums1 = {0,4,0,3,2};
		MaximumAverageSubarrayI bean = new MaximumAverageSubarrayI();
		System.out.println(bean.findMaxAverage(nums1, 1));
	}

}
