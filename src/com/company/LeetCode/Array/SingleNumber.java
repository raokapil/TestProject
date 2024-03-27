package com.company.LeetCode.Array;

public class SingleNumber {

    public static int singleNumber(int[] nums) {

        for (int i=0; i < nums.length; i++) {
            boolean isDuplicate = false;
            for (int j=0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                return nums[i];
            }
        }
        throw new IllegalArgumentException("No single Number found");
    }


    // Bitwise Zor
    public static int singleNumberOptimized(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        int singleNumber = singleNumber(nums);
        System.out.println("The single number is: " + singleNumber);
    }
}
