package com.company.dataStructure.recursion;

public class SubSequences {

    // Time complexity : O(2 power N)
    public static void subSequence(String str, int idx, String newString) {

        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        subSequence(str,idx + 1, newString + currChar);
        subSequence(str,idx + 1, newString);
    }

    public static void main(String[] args) {

        String str = "abc";
        subSequence(str, 0, "");

    }
}
