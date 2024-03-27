package com.company.LeetCode.Array;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[nonZeroIndex];
                nums[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
    }

    public static void moveZeroesWithExtraSpace(int[] nums) {
        List<Integer> nonZeroList = new ArrayList<>();
        List<Integer> zeroList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nonZeroList.add(nums[i]);
            } else {
                zeroList.add(nums[i]);
            }
        }

        nonZeroList.addAll(zeroList);
        for (int i = 0; i < nonZeroList.size(); i++) {
            nums[i] = nonZeroList.get(i);
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.print("Array after moving zeros: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
