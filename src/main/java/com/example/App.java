package com.example;



/**
 * Testing concepts
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        testTwoSumsSolutions();

    }

    public static void testTwoSumsSolutions() {
        int[] in = {2 ,7, 11, 15};
        int target = 9;

        TwoSumsSolution sol = new TwoSumsSolution();

        int[] res = sol.twoSum(in, target);

        for(int i : res) {
            System.out.println(i);
        }
    }
}