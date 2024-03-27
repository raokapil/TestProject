package com.company.dataStructure.recursion;

// Time Complexity : O(4 power N) -> O((No of choices) power (length of input))
public class KeyPadCombination {

    public static String[] keyPad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void keyPadCombination(String str, int idx, String combination) {

        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(idx);
        String mapping = keyPad[currChar - '0'];
        for (int i=0; i < mapping.length(); i++) {
            keyPadCombination(str, idx + 1, combination + mapping.charAt(i));
        }

    }


    public static void main(String[] args) {

        String str = "23";
        keyPadCombination(str, 0, "");

    }
}
