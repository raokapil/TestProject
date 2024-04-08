package com.company.dataStructure.search;

public class LinearSearch {

    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        int[] data = {4, 2, 7, 1, 3};
        int target = 2;
        int result = search(data, target);

        if (result != -1) {
            System.out.println("Target element " + target + " found at index " + result);
        } else {
            System.out.println("Target element not found in the list");
        }
    }
}
