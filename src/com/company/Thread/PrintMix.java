package com.company.Thread;

public class PrintMix {

    public static void main(String[] args) {

        String data = "sdjfakjhd1231h23egdsayctd7s6c";
        char[] charArray = new char[data.length()];
        int[] numArray = new int[data.length()];

        int i = 0,j = 0;
        for (char ch : data.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                charArray[i++] = ch;
            } else {
                numArray[j++] = Integer.parseInt(String.valueOf(ch));
            }
        }

        Thread charThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (char ch : charArray) {
                    System.out.println(ch);
                }
            }
        });

        Thread numThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int num : numArray) {
                    System.out.println(num);
                }
            }
        });


        charThread.start();
        numThread.start();
    }
}
