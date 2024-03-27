package com.company.dataStructure.recursion;

public class Recursion1 {

    public static void printSumOfNaturalNum(int i, int n, int sum) {

        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSumOfNaturalNum(i+1, n, sum);
        System.out.println(i);
    }

    public static void printFactorial(int n, int sum) {

        if (n == 1) {
            sum *= n;
            System.out.println(sum);
            return;
        }
        sum *= n;
        printFactorial(n-1, sum);

    }
}
