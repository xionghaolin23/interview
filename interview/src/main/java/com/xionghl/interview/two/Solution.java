package com.xionghl.interview.two;

import java.util.Arrays;

/**
 * @author xionghaolin
 * 1. 两数相加
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。

请你将两个数相加，并以相同形式返回一个表示和的链表。

你可以假设除了数字 0 之外，这两个数都不会以 0开头。


示例 1：


输入：l1 = [2,4,3], l2 = [5,6,4]
输出：[7,0,8]
解释：342 + 465 = 807.
示例 2：

输入：l1 = [0], l2 = [0]
输出：[0]
示例 3：

输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
输出：[8,9,9,9,0,0,0,1]

https://leetcode-cn.com/problems/add-two-numbers/
 */
public class Solution {

    static class ListNode {
      int val; //链表元素个数
      ListNode next; //节点
      ListNode(int x) { val = x; }
  }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        return null;
    }

    public static void main(String[] args) {

    }
}
