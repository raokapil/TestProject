package com.company.dataStructure.queue;


// Time complexity : add = O(1), remove and peek = O(n)
// Circular Queue Time complexity : add, remove and peek = O(1)

public class QueueY {

    static class Queue {
        static int[] arr;
        static int size;

        Queue(int n) {
            size = n;
            arr = new int[n];
        }

        int rear = -1;
        public boolean isEmpty() {
            if (rear == -1) {
                return true;
            }
            return false;
        }

        public void enQueue(int data) {
            if (rear == size - 1) {
                System.out.println("Queue overflow");
                return;
            }

            arr[++rear] = data;
        }

        public int deQueue() {

            if (isEmpty()) {
                System.out.println("Queue empty");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }

            rear--;
            return front;
        }

        public int peek() {

            if (isEmpty()) {
                System.out.println("Queue empty");
                return -1;
            }

            return arr[0];
        }

    }

    public static void main(String[] args) {

        Queue q = new Queue(5);
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.deQueue();
        }
    }
}
