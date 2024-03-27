package com.company.dataStructure.recursion;

import java.util.HashSet;

public class UniqueSubSequence {

    // Time complexity : O(2 power N)
    public static void subSequence(String str, int idx, String newString, HashSet set) {

        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                set.add(newString);
                System.out.println(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        subSequence(str,idx + 1, newString + currChar, set);
        subSequence(str,idx + 1, newString, set);
    }

    public static void main(String[] args) {

        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subSequence(str, 0, "", set);

    }
}
