package com.company.dataStructure.recursion;

public class ReverseString {

    public static void revString(String str, int idx) {
        if (idx == 0) {
            char ch = str.charAt(idx);
            System.out.print(ch);
            return;
        }
        char ch = str.charAt(idx);
        System.out.print(ch);
        revString(str,idx - 1);

    }

    public static void main(String[] args) {
        String str = "abcd";
        revString(str, str.length() - 1);
        revStringIterative(str);
    }

    public static void revStringIterative (String str) {

        for (int i = str.length() - 1; i >= 0; i-- ) {
            char ch = str.charAt(i);
            System.out.print(ch);
        }
    }
}
