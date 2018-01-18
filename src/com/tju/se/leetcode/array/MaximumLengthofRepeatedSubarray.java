package com.tju.se.leetcode.array;

/**
 * https://leetcode.com/problems/maximum-length-of-repeated-subarray/description/ 
 * @author YanWenXiong
 * create at 2018年1月18日 上午10:38:50
 */
// TODO 超时
public class MaximumLengthofRepeatedSubarray {
	public int findLength(int[] A, int[] B) {
        int lengthA = A.length, lengthB = B.length;
        int result = 0, temp = 0;
        for (int i = 0; i < lengthA; i++) {
        	for (int j = 0; j < lengthB; j++) {
        		temp = findLengthMini(A, i, B, j);
        		result = result > temp ? result : temp;
        	}
        }
        return result;
    }
	
	public int findLengthMini(int[] a, int starta, int[] b, int startb) {
		int result = 0;
		while (starta < a.length && startb < b.length && a[starta] == b[startb]) {
			starta++;
			startb++;
			result++;
		}
		return result;
		
	}
}
