package com.choco.leetcode;


import java.util.Arrays;

/***
 * Q300 最长上升子序列
 * 给定一个无序的整数数组，找到其中最长上升子序列的长度。
 *
 * 示例:
 *
 * 输入: [10,9,2,5,3,7,101,18]
 * 输出: 4
 * 解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。
 * 说明:
 *
 * 可能会有多种最长上升子序列的组合，你只需要输出对应的长度即可。
 * 你算法的时间复杂度应该为 O(n2) 。
 * 进阶: 你能将算法的时间复杂度降低到 O(n log n) 吗?
 */
public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        if (nums.length < 2)
            return nums.length;
        int dp[] = new int[nums.length];
        int len = 0;
        for (int n : nums) {
            int index = Arrays.binarySearch(dp, 0, len, n);
            if (index < 0)
                index = -(index + 1);
            dp[index] = n;
            if (index == len) len++;
        }
        return len;
    }
}

