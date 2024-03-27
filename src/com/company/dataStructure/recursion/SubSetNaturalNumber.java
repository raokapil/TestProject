package com.company.dataStructure.recursion;

import java.util.ArrayList;

public class SubSetNaturalNumber {

    public static void printSubSet(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printset(subset);
            return;
        }

        // when an ele wishes to add
        subset.add(n);
        printSubSet(n - 1, subset);

        // when an ele wishes not to add, it is to be removed from the position (last) where it adds.
        subset.remove(subset.size() - 1);
        printSubSet(n - 1, subset);
    }

    private static void printset(ArrayList<Integer> subset) {

        for (int i=0; i < subset.size(); i++) {
            System.out.print(subset.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        printSubSet(n, subset);
    }
}
