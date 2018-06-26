package com.tju.se.explore.array;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/26/
 * 给定两个数组，写一个方法来计算它们的交集。
 */
public class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int length1 = nums1.length, length2 = nums2.length;
        int i1 = 0, i2 = 0, sameIndex = 0;

        while (i1 < length1 && i2 < length2) {
            if (nums1[i1] == nums2[i2]) {
                nums2[sameIndex] = nums2[i2];
                sameIndex++;
                i1++;
                i2++;
            } else if (nums1[i1] > nums2[i2]) {
                i2++;
            } else {
                i1++;
            }
        }
        return Arrays.copyOfRange(nums2, 0 ,sameIndex);
    }
}
