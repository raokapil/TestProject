package com.company.LeetCode.Array;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1; // i points to the last unique element + 1 for the size
    }


    
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4};
        int newLength = removeDuplicates(nums);
        
        int[] uniqueArray = Arrays.stream(sortedArray)
                                  .distinct()
                                  .toArray();

        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
