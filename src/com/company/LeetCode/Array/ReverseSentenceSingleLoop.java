package com.company.LeetCode.Array;

public class ReverseSentenceSingleLoop {
    public static String reverseSentence(String sentence) {
        StringBuilder reversedSentence = new StringBuilder();
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            StringBuilder reversedWord = new StringBuilder();
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reversedWord.append(words[i].charAt(j));
            }
            reversedSentence.append(reversedWord + " ");
        }

        return reversedSentence.toString().trim();
    }

    public static void main(String[] args) {
        String originalSentence = "one two three four";
        String reversedSentence = reverseSentence(originalSentence);
        System.out.println("Original sentence: " + originalSentence);
        System.out.println("Reversed sentence: " + reversedSentence);
    }
}
