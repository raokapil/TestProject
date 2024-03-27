package com.company.dataStructure.queue;

public class CircularQueue {

    static class Queue {
        static int[] arr;
        static int size;
        static int front = -1;
        static int rear = -1;

        Queue(int n) {
            arr = new int[n];
            size = n;
        }

        static public boolean isEmpty() {
            return front == -1 && rear == -1;
        }

        static public boolean isFull() {
            return (rear + 1) % size == front;
        }

        static public void enqueue(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            // First insertion
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        static public int dequeue () {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[front];

            // single element condition
            if (front == rear) { // equals to zero
                front = rear = -1;
            } else {
                // useful when front is on last index and we need to bring it to initial position.
                front = (front + 1) % size;
            }

            return result;
        }

        static public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }
    }


    public static void main(String[] args) {

        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q.dequeue());
        q.enqueue(6);
        System.out.println(q.dequeue());
        q.enqueue(7);


        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
