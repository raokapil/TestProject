package com.company.dataStructure.sorting;

import java.util.Arrays;

// O(nlogn)
public class MergeSort {

    // O(n)
    private static void conquer(int[] arr, int si, int mid, int ei) {

        int merged[] = new int[ei - si + 1]; // Since last index is one less than the length of array.

        int idx1 = si, idx2 = mid + 1, x = 0;

        while(idx1 <= mid && idx2 <=ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while(idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while(idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        for (int i =0 ,j =si; i < merged.length ; i++, j++) {
            arr[j] = merged[i];
        }
    }

    // O(logn)
    private static void divide(int[] arr, int si, int ei) {

        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2; // we didn't take (si + ei) / 2 as if both numbers are too large
        // and sum generated will go out of range of int.
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {

        int arr[] = {6,3,9,5,2,8};
        System.out.println("Original Array : ");
        printArray(arr);

        divide(arr, 0, arr.length - 1);

        System.out.printf(" sorted Array : ");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
