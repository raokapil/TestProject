package com.company.LeetCode.Array;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;

            if (carry == 0) {
                break;
            }
        }

        if (carry > 0) {
            int[] results = new int[digits.length + 1];
            results[0] = carry;
            System.arraycopy(digits, 0, results, 1, digits.length);
            return results;
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] result = plusOne(digits);
        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
