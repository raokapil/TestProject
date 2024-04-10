package com.company.LeetCode.String;

// Two strings are considered anagrams if they contain the same characters with the same frequency, only rearranged.
public class ValidAnagram {

  public static boolean isAnagram(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false; // Different lengths cannot be anagrams
    }

    // Use a HashMap to store character and its frequency
    HashMap<Character, Integer> charCount = new HashMap<>();

    // Count character frequencies in the first string
    for (char c : str1.toCharArray()) {
      charCount.put(c, charCount.getOrDefault(c, 0) + 1);
    }

    // Decrement character frequencies for the second string
    for (char c : str2.toCharArray()) {
      int count = charCount.getOrDefault(c, 0);
      if (count == 0) {
        return false; // Character not present in first string
      }
      charCount.put(c, count - 1);
    }

    // Check if all character frequencies in HashMap are zero
    for (int count : charCount.values()) {
      if (count != 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String str1 = "सुनो"; // Hindi word "Suno"
    String str2 = "नोषु"; // Hindi word "Noush" (anagram of Suno)

    if (isAnagram(str1, str2)) {
      System.out.println(str1 + " and " + str2 + " are anagrams");
    } else {
      System.out.println(str1 + " and " + str2 + " are not anagrams");
    }
  }
}
