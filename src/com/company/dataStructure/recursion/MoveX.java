package com.company.dataStructure.recursion;

public class MoveX {

    public static void moveX(String str, int idx, int count, String newString) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char ch = str.charAt(idx);
        if (ch == 'x') {
            count ++;
            moveX(str, idx + 1, count, newString);
        } else {
            newString += ch;
            moveX(str, idx + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        moveX(str, 0, 0, "");
    }
}
