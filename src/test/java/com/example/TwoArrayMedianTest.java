package com.example;

import static org.junit.Assert.assertTrue;

import com.example.addTwoNumber.ListNode;
import com.example.TwoArrayMedian.Solution;
import org.junit.Before;
import org.junit.Test;

/**
 * Test solution for java problem Median of Two Sorted Arrays
 * found at https://leetcode.com/problems/median-of-two-sorted-arrays/
 */
public class TwoArrayMedianTest {

    private Solution solution;

    @Before
    public void init() {
        this.solution = new Solution();
    }

    @Test
    public void testCase1() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double expectedValue = 2.0;
        double actualValue = solution.findMedianSortedArrays(nums1, nums2);

        assertTrue("the expected doesn't match actual", actualValue == expectedValue);
    }

    @Test
    public void testCase2() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        double expectedValue = 2.5;
        double actualValue = solution.findMedianSortedArrays(nums1, nums2);

        assertTrue("the expected doesn't match actual", actualValue == expectedValue);

    }

}
