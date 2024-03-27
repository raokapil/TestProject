package com.company.dataStructure.sorting;

public class SelectionSort {

    // Find the smallest element index by comparing and then swap it with first
    // element at the end of iteration.

    // One swap per iteration.

    // Unlike bubble sort, this sort eliminates unnecessary swaps.
    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;

            for (int j= i+1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }
}
