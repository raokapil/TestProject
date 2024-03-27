package com.company.Thread;

public class PrintSequence3Threads {

    private static int counter = 1;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        int maxNumber = 10;

        Thread thread1 = new Thread(() -> {
            while (counter <= maxNumber) {
                synchronized (lock) {
                    if (counter % 3 == 0) {
                        System.out.println(counter + " : Thread - 1");
                        counter++;
                        lock.notifyAll();
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

        Thread thread2 = new Thread(() -> {
            while (counter < maxNumber) {
                synchronized (lock) {
                    if (counter % 3 == 1) {
                        System.out.println(counter + " : Thread - 2");
                        counter++;
                        lock.notifyAll();
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


        Thread thread3 = new Thread(() -> {
            while (counter < maxNumber) {
                synchronized (lock) {
                    if (counter % 3 == 2) {
                        System.out.println(counter + " : Thread - 3");
                        counter++;
                        lock.notifyAll();
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

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
