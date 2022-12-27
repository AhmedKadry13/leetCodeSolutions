package com.example;

import static org.junit.Assert.assertTrue;

import com.example.addTwoNumber.ListNode;
import com.example.addTwoNumber.Solution;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

/**
 * Test solution for java problem add two numbers
 * found at https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbersTest {

    private Solution solution;

    @Before
    public void init() {
        this.solution = new Solution();
    }

    @Test
    public void testCase1() {
        ListNode l1 = solution.integerToNode(BigInteger.valueOf(243));
        ListNode l2 = solution.integerToNode(BigInteger.valueOf(564));
        BigInteger expectedValue = BigInteger.valueOf(708);

        BigInteger actualValue = solution.nodeToInteger(solution.addTwoNumbers(l1, l2));
        assertTrue("the expected doesn't match actual", actualValue.equals(expectedValue));
    }

    @Test
    public void testCase2() {
        ListNode l1 = solution.integerToNode(BigInteger.valueOf(249));
        ListNode l2 = solution.integerToNode(BigInteger.valueOf(5649));
        BigInteger expectedValue = BigInteger.valueOf(70401);

        BigInteger actualValue = solution.nodeToInteger(solution.addTwoNumbers(l1, l2));
        System.out.println("actual value = " + actualValue);
        assertTrue("the expected doesn't match actual", actualValue.equals(expectedValue));
    }

    @Test
    public void testCase3() {
        ListNode l1 = solution.integerToNode(BigInteger.valueOf(9999999));
        ListNode l2 = solution.integerToNode(BigInteger.valueOf(9999));
        BigInteger expectedValue = BigInteger.valueOf(89990001);

        BigInteger actualValue = solution.nodeToInteger(solution.addTwoNumbers(l1, l2));
        assertTrue("the expected doesn't match actual", actualValue.equals(expectedValue));
    }

    @Test
    public void testCase4() {
        ListNode l1 = solution.integerToNode(BigInteger.valueOf(789019));
        ListNode l2 = solution.integerToNode(BigInteger.valueOf(5649));
        BigInteger expectedValue = BigInteger.valueOf(254029);

        BigInteger actualValue = solution.nodeToInteger(solution.addTwoNumbers(l1, l2));
        System.out.println("actual value = " + actualValue);
        assertTrue("the expected doesn't match actual", actualValue.equals(expectedValue));
    }

    @Test
    public void testCase5() {
        ListNode l1 = solution.integerToNode(BigInteger.valueOf(9));
        ListNode l2 = solution.integerToNode(BigInteger.valueOf(1999999999));
        BigInteger expectedValue = BigInteger.valueOf(1);

        BigInteger actualValue = solution.nodeToInteger(solution.addTwoNumbers(l1, l2));
        System.out.println("actual value = " + actualValue);
        assertTrue("the expected doesn't match actual", actualValue.equals(expectedValue));
    }
    
}
