package com.company.LeetCode.String;

public class ReverseInteger {
    public static int reverse(int x) {
       int reversed = 0;
       while (x != 0) {
           int lastDigit = x % 10;
           x /= 10; // remove last digit

           reversed = reversed * 10 + lastDigit;
       }
       return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123)); // Output: 321
        System.out.println(reverse(-123)); // Output: -321
        System.out.println(reverse(120)); // Output: 21
        System.out.println(reverse(0)); // Output: 0
        System.out.println(reverse(1534236469)); // Output: 0 (overflow)
    }
}
