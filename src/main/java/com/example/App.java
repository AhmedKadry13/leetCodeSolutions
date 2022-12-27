package com.example;

import com.example.addTwoNumber.ListNode;
//import com.example.addTwoNumber.Solution;
import com.example.TwoArrayMedian.Solution;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Testing concepts
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Solution s = new Solution();
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        double sumFromSolution = s.findMedianSortedArrays(nums1, nums2);
        System.out.println("sum from solution = " + sumFromSolution);

        ArrayList<Integer> res = s.mergeArrays(nums1, nums2);
        System.out.println("first item = " + res.get(res.size()/2)); 
        System.out.println("second item = " + res.get(res.size()/2 - 1));

        double med = res.get(res.size()/2) + res.get(res.size()/2 - 1) / 2;

        s.mergeArrays(nums1, nums2).stream().forEach(System.out::println);
        System.out.println(res.size()/2);

    }

    // public void testAddTwoNumbers() {
    //     Solution solution = new Solution();

    //     ListNode l1 = solution.integerToNode(BigInteger.valueOf(9));
    //     ListNode l2 = solution.integerToNode(BigInteger.valueOf(1999999999));

    //     BigInteger expectedValue = BigInteger.valueOf(254029);

    //     BigInteger reversedIntL1 = solution.nodeToInteger(solution.reverseList(l1));
    //     BigInteger reversedIntL2 = solution.nodeToInteger(solution.reverseList(l2));

    //     System.out.println("l1 reversed value = " + reversedIntL1);
    //     System.out.println("l1 reversed value = " + reversedIntL2);


    //     BigInteger reversedSum = reversedIntL1.add(reversedIntL2);

    //     System.out.println("reversed total 1 = " + reversedSum);

    //     ListNode reversedSumList = solution.integerToNode(reversedSum);
    //     ListNode reversedSumListReversed = solution.reverseList(reversedSumList);

    //     System.out.println("final value = " + solution.nodeToInteger(reversedSumListReversed));

    //     System.out.println("test add two number = " + solution.nodeToInteger(solution.addTwoNumbers(l1, l2)));
    // }

    // public static ListNode createTestListNode() {
    //     ListNode temp1 = new ListNode();
    //     temp1.value = 1;

    //     ListNode temp2 = new ListNode();
    //     temp2.value = 2;
    //     temp1.next = temp2;

    //     ListNode temp3 = new ListNode();
    //     temp3.value = 3;
    //     temp2.next = temp3;

    //     return temp1;
        
    // }

    // public static void testTwoSumsSolutions() {
    //     int[] in = {2 ,7, 11, 15};
    //     int target = 9;

    //     Solution sol = new Solution();

    //     int[] res = sol.twoSum(in, target);

    //     for(int i : res) {
    //         System.out.println(i);
    //     }
    // }
}