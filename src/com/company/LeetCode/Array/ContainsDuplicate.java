package com.company.LeetCode.Array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean duplicateExists = containsDuplicate(nums);
        boolean duplicateExistsOptimized = containsDuplicateOptimized(nums);
        System.out.println("Array contains duplicate? " + duplicateExists + " , optimized : " + duplicateExistsOptimized);
    }

    private static boolean containsDuplicateOptimized(int[] nums) {

        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : nums) {
            if (uniqueSet.contains(num)) {
                return true;
            }
            uniqueSet.add(num);
        }
        return false;
    }

    public static void printDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        System.out.println("Duplicate elements:");
        for (int num : arr) {
            if (seen.contains(num)) {
                System.out.print(num + " ");
            } else {
                seen.add(num);
            }
        }
    }

    private static boolean containsDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
