package com.company.dataStructure.sorting;

import java.util.Arrays;

// Time complexity : Avg case -> O(nlogn) , Worst Case -> O(n2)
// Worst case occurs when pivot is always the smallest or the largest element and this occurs when the array
// is already sorted either ascending or descending.
public class QuickSort {

    private static int partition(int[] arr, int low, int high) {

        // considering last element as our pivot [Approach]
        int pivot = arr[high];

        // considering no element is lesser than pivot initially
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {

                //  Create space for ele less than pivot
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // create space for pivot
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i; // return pivot index
    }

    private static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pidx = partition(arr, low, high);
            quickSort(arr, low, pidx - 1);
            quickSort(arr, pidx + 1, high);
        }
    }

    public static void main(String[] args) {

        int arr[] = {6,3,9,5,2,8};
        System.out.println("Original Array : ");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.printf(" sorted Array : ");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
