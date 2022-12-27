package com.example.addTwoNumber;

import java.math.BigInteger;
import java.util.Stack;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        BigInteger reversedL1Integer = nodeToInteger(reverseList(l1));
        BigInteger reversedL2Integer = nodeToInteger(reverseList(l2));

        BigInteger reversedListsSum = reversedL1Integer.add(reversedL2Integer);

        return reverseList(integerToNode(reversedListsSum));
    }

    // reverse the list
    public ListNode reverseList(ListNode in) {

        // use stack to hold the values in the list
        Stack<ListNode> nodesStack = new Stack<>();

        nodesStack.push(in);
        ListNode current = in.next;

        // loop throw the linked list to add next node to the stack
        while (true) {
            if (current == null) {
                break;
            } else {
                nodesStack.push(new ListNode(current.val));
                current = traverse(current);
            }
        }

        // create the reversed lists
        ListNode res = nodesStack.pop();
        ListNode currentNode = res;

        while (!nodesStack.isEmpty()) {
            currentNode = addNextListNode(currentNode, nodesStack.pop());
        }

        return res;
    }

    // traverse the linked list
    private ListNode traverse(ListNode l) {
        return l.next;
    }

    // add the next node to an existing node
    private static ListNode addNextListNode(ListNode list, ListNode node) {
        list.next = node;
        node.next = null;
        return node;
    }

    // print the list nodes values
    public BigInteger nodeToInteger(ListNode l) {
        StringBuilder res = new StringBuilder();
        ListNode current = l;

        while (true) {
            if (current == null) {
                break;
            } else {
                res.append(current.val);
                current = traverse(current);
            }
        }
        return new BigInteger(res.toString());
    }

    //get new node list from integer
    public ListNode integerToNode(BigInteger reversedListsSum) {
        ListNode peek = new ListNode(Character.getNumericValue(reversedListsSum.toString().charAt(0)));
        ListNode current = peek; 
        for(int count = 1; count < reversedListsSum.toString().length(); count++) {
            current.next = new ListNode(Character.getNumericValue(reversedListsSum.toString().charAt(count)));
            current = traverse(current);
        }
        return peek;
    }
}
