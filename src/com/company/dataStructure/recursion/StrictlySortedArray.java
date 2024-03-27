package com.company.dataStructure.recursion;

public class StrictlySortedArray {

    public static boolean sortedArray(int[] arr, int idx) {

        if (idx == arr.length - 1) {
            return true;
        }

        if (arr[idx] < arr[idx + 1]) {
            boolean what = sortedArray(arr, idx + 1);
            System.out.println(what);
            return what;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int[] arr = {2,3,3};
        System.out.println(sortedArray(arr,0));
    }
}
