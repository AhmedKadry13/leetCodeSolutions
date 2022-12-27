package com.example.TwoArrayMedian;

import java.util.ArrayList;
import java.util.Collections;


public class Solution {
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = mergeArrays(nums1, nums2);
        if(res.size() % 2 != 0) {
            return res.get(res.size()/2);
        }
        else {
            double sum = res.get(res.size()/2) + res.get(res.size()/2 - 1);
            return sum / 2;
        }

    }

    public ArrayList<Integer> mergeArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = arrayToArrayList(nums1);
        res.addAll(arrayToArrayList(nums2));
        Collections.sort(res);
        return res;
        
    }

    private ArrayList<Integer> arrayToArrayList(int[] in) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int n : in) {
            res.add(n);
        }
        return res; 
    }
}
