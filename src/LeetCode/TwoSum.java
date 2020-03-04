package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

https://leetcode.com/problems/two-sum/

 */


public class TwoSum {

    private int target;
    private int[] array;

    public TwoSum(int target, int[] array) {
        this.target = target;
        this.array = array;
    }

    public void twoSum() {
        Map<Integer, Integer> map = new HashMap<>();
        int complement;
        for (int i = 0; i < array.length; i ++) {
            complement = target - array[i];
            if (map.containsKey(complement)) {
                System.out.println("position : " + i + " " + map.get(complement));
                return;
            } else {
                map.put(array[i], i);
            }
        }
        System.out.println("Solution not found!");
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum(9, new int[]{123, 5, 3, 1, 6});
        twoSum.twoSum();
    }
}
