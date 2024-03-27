package com.company.LeetCode.String;

public class ReverseString {
    public static String reverseString(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static String reverseStringRecursively(String str) {

        if (str.isEmpty() || str == null) {
            return str;
        }

        return reverseStringRecursively(str.substring(1)) + str.charAt(0);
    }

    public static String reverseStringIterativelyThroughCharacterArray(String str) {
        if (str.isEmpty() || str == null) {
            return str;
        }

        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        String originalString = "Hello, world!";
        String reversedString = reverseString(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }
}
