package com.company.Thread;

public class PrintEvenOdd {


    private static int counter = 1;
    private static final Object lock = new Object();

    public static void main(String[] args) {

        int maxNumber = 100;

        Thread evenThread = new Thread(() -> {
            while (counter <= maxNumber) {
                synchronized (lock) {
                    if (counter % 2 == 0) {
                        System.out.println(counter + " Even Thread") ;
                        counter++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException exception) {
                            exception.printStackTrace();
                        }
                    }
                }
            }
        });

        Thread oddThread = new Thread(() -> {
            while (counter <= maxNumber) {
                synchronized (lock) {
                    if (counter % 2 != 0) {
                        System.out.println(counter + " Odd Thread");
                        counter++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        evenThread.start();
        oddThread.start();
    }
}
