package com.company.dataStructure.queue;

public class LinkedList {

    static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        static public boolean isEmpty() {
            return head == null && tail == null;
        }

        static public void enqueue(int data) {

            Node newNode = new Node(data);

            if (tail == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        static public int dequeue () {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int result = head.data;
            if (head == tail) {
                tail = null;
            }

            head = head.next;
            return result;
        }

        static public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return head.data;
        }
    }


    public static void main(String[] args) {

        Queue q = new Queue();
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
