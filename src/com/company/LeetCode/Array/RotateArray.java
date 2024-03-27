package com.company.LeetCode.Array;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle the case where k is greater than array length
        int[] temp = new int[k];

        // Copy the first k elements to the temporary array
        System.arraycopy(nums, 0, temp, 0, k);

        // Move the remaining elements (n-k) to the left by k positions
        System.arraycopy(nums, k, nums, 0, n - k);

        // Copy the temporary array elements back to the end of the original array
        System.arraycopy(temp, 0, nums, n - k, k);
    }

    public static void rotateOptimized(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle the case where k is greater than array length

        // Reverse the entire array
        reverse(nums, 0, n - 1);

        // Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Reverse the remaining (n-k) elements
        reverse(nums, k, n - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
        //rotateOptimized(nums, k);
        System.out.print("Rotated array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
