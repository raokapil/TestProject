package com.company.LeetCode.String;

import java.util.HashSet;
import java.util.Set;

//Using sliding window technique with a hash table.
public class LongestSubstringWithoutRepeatingCharacters {


    public static int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int i = 0, max_length = 0;
        for (int j = 0; j < s.length(); j++) {
            while (seen.contains(s.charAt(j))) {
                seen.remove(s.charAt(i));
                i++;
            }
            seen.add(s.charAt(j));
            max_length = Math.max(max_length, j - i + 1);
        }
        return max_length;
    }

    public static void main(String[] args) {

        lengthOfLongestSubstring("abc");
    }
}
