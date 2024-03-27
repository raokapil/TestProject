package com.company.dataStructure.stack;

public class ReverseString {

    static class Stack {
        int top;
        int size;
        char[] a;

        Stack(int n) {
            top = -1;
            size = n;
            a = new char[size];
        }

        public boolean isEmpty() {
            return top < 0;
        }

        public void push (char data) {
            if (top > size) {
                System.out.println("Stack Overflow");
                return;
            }

            a[++top] = data;
        }

        public char pop () {
            if (isEmpty()) {
                System.out.println("Stack underflow");
                return 0;
            }

            return a[top--];
        }
    }


    public  static void reverse (StringBuffer string) {

        Stack stack = new Stack(string.length());

        for (int i=0; i < string.length(); i++) {
            stack.push(string.charAt(i));
        }

        for (int i=0; i < string.length(); i++) {
            char ch = stack.pop();
            string.setCharAt(i, ch);
        }
    }
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Kapil");
        System.out.println(stringBuffer);
        reverse(stringBuffer);
        System.out.println(stringBuffer);

    }

}
