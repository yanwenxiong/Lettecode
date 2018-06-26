package com.tju.se.explore.array;

import java.util.Arrays;

/**
 * 给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/27/
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        digits[length - 1]++;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] >= 10) {
                digits[i] = 0;
                if (i != 0) {
                    digits[i - 1]++;
                } else {
                    return pulsOneMore(digits);
                }
            } else {
                break;
            }
        }
        return digits;
    }

    private int[] pulsOneMore(int[] digits) {
        int[] special = new int[digits.length + 1];
        special[0] = 1;
        for (int i = 1; i < special.length; i++) {
            special[i] = digits[i-1];
        }
        return special;
    }
}
