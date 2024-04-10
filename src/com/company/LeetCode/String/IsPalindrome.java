package com.company.LeetCode.String;

public class IsPalindrome {
  
    public static boolean isPalindrome(String text) {
  if (text == null || text.isEmpty()) {
    return true; // Empty string is a palindrome
  }

  int left = 0;
  int right = text.length() - 1;

  while (left <= right) {
    char leftChar = Character.toLowerCase(text.charAt(left));
    char rightChar = Character.toLowerCase(text.charAt(right));

    if (!Character.isLetterOrDigit(leftChar)) {
      left++;
    } else if (!Character.isLetterOrDigit(rightChar)) {
      right--;
    } else if (leftChar != rightChar) {
      return false;
    } else {
      left++;
      right--;
    }
  }
  return true;
}
    public static void main(String[] args) {
        String originalString = "race a car";
        String isPalindromeString = isPalindrome(originalString);
        System.out.println("isPalindromeString: " + isPalindromeString);
       
    }
}
