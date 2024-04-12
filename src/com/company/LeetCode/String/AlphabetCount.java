package com.company.LeetCode.String;

public class AlphabetCount {

    public static void main(String[] args) {
        String name = "Alice"; // Replace with your desired name
        int[] alphabetCount = new int[26]; // Array to store count for each alphabet (a-z)

        for (char ch : name.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                int index = ch - 'a'; // Calculate index based on ASCII value (a-z: 97-122)
                alphabetCount[index]++;
            }
        }

        System.out.println("Alphabet occurrences in '" + name + "':");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int count = alphabetCount[ch - 'a'];
            if (count > 0) {
                System.out.println(ch + ": " + count);
            }
        }
    }
}
