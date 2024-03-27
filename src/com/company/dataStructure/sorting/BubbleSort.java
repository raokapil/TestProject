package com.company.dataStructure.sorting;

public class BubbleSort {


    // Shifting high value array elements to the last position of array, making it the ascending sorted array
    // By reversing it, we can get descending order sorted array.
    // total (n-1) shifts, since smallest element automatically comes to its lowest position

    // Main trick is to compare adjacent pair of elements and shift to the right (end of the array)
    public static void bubbleSort(int[] arr) {
        boolean swapped = false;
        for (int i = 0; i < arr.length - 1; i++) { // runs loop (n-1) times
            swapped = true;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    // shift high value array element to last
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = false;

                }
            }

            if (!swapped) {
                break;
            }
        }
    }
}
