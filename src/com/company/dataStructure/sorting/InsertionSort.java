package com.company.dataStructure.sorting;

public class InsertionSort {

    // Divide the array into two halves : sorted or unsorted
    // Pick an element from unsorted part and place it into sorted part in its correct position,
    // which ultimately gives the sorted array.


    // 7|8312 -> 78|312 -> 378|12 -> 1378|2 -> 12378
    // If the compared element(sorted region) is larger than element in unsorted region, we push the element
    // back to create space for smaller element in sorted region.
    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i]; // element to place in correct pos
            int j = i - 1; // To track sorted region

            while (j >= 0 && current < arr[j]) { // second condition gets dissatisfied when either current element gets bigger or element need to place in beginning
                arr[j+1] = arr[j]; // push the element forward to create space
                j--;
            }

            //placement of unsorted array element in sorted region
            arr[j+1] = current;
        }

    }
}
