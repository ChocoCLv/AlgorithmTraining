package com.choco.leetcode;

/***
 * Q26 删除排序数组中的重复项
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * 示例 1:
 *
 * 给定数组 nums = [1,1,2],
 *
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例 2:
 *
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 *
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 */
public class RemoveDuplicatesFromSortedArray {
    class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length < 2) {
                return nums.length;
            }
            int i = 0;
            int j = 1;
            while (j < nums.length) {
                if (nums[i] == nums[j]) {
                    j++;
                } else {
                    i++;
                    if (i != j) {
                        nums[i] = nums[j];
                    } else {
                        j++;
                    }
                }
            }
            return i + 1;
        }
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray rdfsa = new RemoveDuplicatesFromSortedArray();
        Solution solution = rdfsa.new Solution();
        int a[] = {0, 0};
        int result = solution.removeDuplicates(a);
        System.out.println(result);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
