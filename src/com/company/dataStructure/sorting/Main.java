package com.company.dataStructure.sorting;

import java.util.Arrays;

import static com.company.dataStructure.recursion.Recursion1.printFactorial;
import static com.company.dataStructure.recursion.Recursion1.printSumOfNaturalNum;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int arr[] = {100,3,2};
        System.out.printf("Original Array : ");
        printArray(arr);
        /*BubbleSort.bubbleSort(arr);
        System.out.printf("Bubble sort Array : ");*/

        /*SelectionSort.selectionSort(arr);
        System.out.printf("Selection sort Array : ");*/

        InsertionSort.insertionSort(arr);
        System.out.printf("Insertion sort Array : ");
        printArray(arr);


        printSumOfNaturalNum(1, 5, 0);

        printFactorial(5, 1);
    }

    public static void printArray(int[] arr) {
        System.out.printf(Arrays.toString(arr));
    }
}
