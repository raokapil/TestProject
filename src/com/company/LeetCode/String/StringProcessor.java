package com.company.LeetCode.String;

public static void main(String[] args) {
        String input = "s1u2s3-suusss";

        StringBuilder output = new StringBuilder();
        char prevChar = ' '; // Initialize with a space to handle the first character

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                output.append(ch);
                prevChar = ch;
            } else if (Character.isDigit(ch)) {
                int num = Character.getNumericValue(ch);
                // Repeat the previous character the specified number of times
                for (int i = 0; i < num; i++) {
                    output.append(prevChar);
                }
            }
        }

        System.out.println("Processed string: " + output.toString());
    }
}
