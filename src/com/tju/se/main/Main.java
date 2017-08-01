package com.tju.se.main;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import com.tju.se.leetcode.ArrayNesting;
import com.tju.se.leetcode.Battleships;
import com.tju.se.leetcode.CanPlaceFlowers;
import com.tju.se.leetcode.FindMedian;
import com.tju.se.leetcode.MaximumAverageSubarrayI;
import com.tju.se.leetcode.SearchInsertPosition;
import com.tju.se.leetcode.ShortestUnsortedContinuousSubarray;
import com.tju.se.leetcode.SlidingWindowMedian;
import com.tju.se.leetcode.ValidTriangleNumber;

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
		
		/*int[] nums = {1,12,-5,-6,50,3};
		int[] nums1 = {0,4,0,3,2};
		MaximumAverageSubarrayI bean = new MaximumAverageSubarrayI();
		System.out.println(bean.findMaxAverage(nums1, 1));*/
		
		/*int[] nums = {1,0,0,0,1,0,0};
		int n = 2;
		CanPlaceFlowers bean = new CanPlaceFlowers();
		System.out.println(bean.canPlaceFlowers(nums, n));*/
		
		/*
		 * SlidingWindowMaximum
		SlidingWindowMaximum bean = new SlidingWindowMaximum();
		int[] nums = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		int[] result = bean.maxSlidingWindow(nums, k);
		outputArray(result);*/
		
		/*
		 * MinimumWindowSubstring
		MinimumWindowSubstring bean = new MinimumWindowSubstring();
		String s = "bbaa";
		String t = "aba";
		System.out.println(bean.minWindow(s, t));*/
		
		/*
		 * MaximumAverageSubarrayII
		int[] nums = {1,12,-5,-6,50,3};
		int k = 4;
		MaximumAverageSubarrayII bean = new MaximumAverageSubarrayII();
		System.out.println(bean.findMaxAverage(nums, k));*/
		
		/*
		 * MaximumProductofThreeNumbers
		 * int[] nums = {-4,-2,3,4};
		MaximumProductofThreeNumbers bean = new MaximumProductofThreeNumbers();
		System.out.println(bean.maximumProduct(nums));*/
		
		/*char[] tasks = {'A','A','A','B','B','B','C','C','D'};
		int n = 1;
		TaskScheduler bean = new TaskScheduler();
		System.out.println(bean.leastInterval(tasks, n));*/
		
		/*ValidTriangleNumber bean = new ValidTriangleNumber();
		int[] nums = {2,2,3,4};
		System.out.println(bean.triangleNumber(nums));*/
		
		/*int[] nums = {2,1};
		ShortestUnsortedContinuousSubarray bean = new ShortestUnsortedContinuousSubarray();
		System.out.println(bean.findUnsortedSubarray(nums));*/
		
		ArrayNesting bean = new ArrayNesting();
		int[] nums = {0,1,2,4,3};
		System.out.println(bean.arrayNesting(nums));
	}
	
	
	public static void outputArray(int[] array){
		for(int temp : array){
			System.out.print(temp + " ");
		}
		System.out.println();
	}
}
