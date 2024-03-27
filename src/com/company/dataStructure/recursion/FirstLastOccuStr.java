package com.company.dataStructure.recursion;

public class FirstLastOccuStr {
    public static int first = -1;
    public static int last = -1;

    public static void findOcc(String str, int idx, char ele) {
        if (idx == str.length() - 1) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char ch  = str.charAt(idx);
        if (ch == ele) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

        findOcc(str, idx+1, ele);
    }

    public static void main(String[] args) {

        String str = "abaacdaefaah";
        findOcc(str, 0, 'a');

    }
}
