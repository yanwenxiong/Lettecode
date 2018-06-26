package com.tju.se.explore.array;

/**
 * 给定一个整数数组，判断是否存在重复元素。如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/24/
 */
public class ContainDuplicate {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length - 1; j++) {
                if (nums[i] == nums[j+1]) {
                    return true;
                }
            }
        }
        return false;
    }
}
