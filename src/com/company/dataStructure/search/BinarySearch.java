package com.company.dataStructure.search;

public class BinarySearch {

    public static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoid integer overflow

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] data = {2, 5, 7, 10, 13, 18}; // Sorted array
        int target = 10;
        int result = search(data, target);

        if (result != -1) {
            System.out.println("Target element " + target + " found at index " + result);
        } else {
            System.out.println("Target element not found in the list");
        }
    }
}
