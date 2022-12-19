package com.example;

import java.util.ArrayList;

public class TwoSumsSolution {

    public int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];

        for(int i = 0; i < nums.length; i++) {
            ArrayList<Integer> al = arrayToArrayList(nums);
            if(al.subList(i + 1, al.size()).indexOf(target - nums[i]) != -1) {
                res[0] = i;
                res[1] = al.lastIndexOf(target - nums[i]);
                break;
            }
            else {
                al.remove(i);
            }
        }


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
