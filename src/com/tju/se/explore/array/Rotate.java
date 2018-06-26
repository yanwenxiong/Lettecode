package com.tju.se.explore.array;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/23/
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 */
public class Rotate {
    public void rotate(int[] nums, int k) {
        int temp, length = nums.length;
        k = k % length;
        for (int i = 0; i < k; i++) {
            temp = nums[length - k + i];
            for (int j = length - k + i; j > i; j--) {
                nums[j] = nums[j - 1];
            }
            nums[i] = temp;
        }
    }
}
