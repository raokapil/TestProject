package com.company.Thread.producerConsumerBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerBlockingQueue {

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<Item> queue = new ArrayBlockingQueue<>(10);

        // Producer
        final Runnable producer = () -> {
            int count = 0;
            while (true) {
                Item item = new Item("Message : " + count);
                try {
                    queue.put(item);
                    System.out.println("Produced : " + item.getMessage());
                    count++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
        };

        new Thread(producer).start();
        new Thread(producer).start();

        //Consumer
        final Runnable consumer = () -> {
            while (true) {
                Item item = null;
                try {
                    item = queue.take();
                    System.out.println("Consumed : " + item.getMessage());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
        };

        new Thread(consumer).start();
        new Thread(consumer).start();

        Thread.sleep(1000);
    }
}
