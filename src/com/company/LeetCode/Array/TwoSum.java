package com.company.LeetCode.Array;

import java.util.HashMap;
import java.util.Map;

// Using HashMap
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {


        Map<Integer, Integer> seenMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seenMap.containsKey(complement)) {
                return new int[] {seenMap.get(complement), i};
            }

            seenMap.put(nums[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args) {

        System.out.println(twoSum(new int[] {5,2}, 7));
    }
}
