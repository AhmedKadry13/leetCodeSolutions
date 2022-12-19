package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Test solution for java problem two-sums
 * found at https://leetcode.com/problems/two-sum/
 */
public class TwoSumsSolutionTest {

    private Solution solution;

    @Before
    public void init() {
        this.solution = new Solution();
    }

    @Test
    public void testCase1() {
        int[] in = {2 ,7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};

        assertTrue("first test", Arrays.equals(expected, solution.twoSum(in, target))) ;
    }

    @Test
    public void testCase2() {
        int[] in = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        assertTrue("first test", Arrays.equals(expected, solution.twoSum(in, target))) ;
    }

    @Test
    public void testCase3() {
        int[] in = {3 , 3};
        int target = 6;
        int[] expected = {0, 1};
        assertTrue("first test", Arrays.equals(expected, solution.twoSum(in, target))) ;
        
    }
}
