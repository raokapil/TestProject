package com.company.dataStructure.stack;

public class StackClass {
    static class Node {
        private int data;
        private Node next;

        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {

        private static Node head;

        public boolean isEmpty () {
            return head == null;
        }

        public void push (int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public int pop () {
            if (isEmpty()) {
                return -1;
            }

            int nodeData = head.data;
            head = head.next;
            return nodeData;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }

            return head.data;
        }


        public void pushAtBottom(int data, Stack stack) {
            if (stack.isEmpty()) {
                stack.push(data);
                return;
            }

            int top = stack.pop();
            pushAtBottom(data, stack);
            stack.push(top);
        }

        public void reverse(Stack stack) {
            if (stack.isEmpty()) {
                return;
            }

            int top = stack.pop();
            reverse(stack);
            stack.pushAtBottom(top, stack);
        }

    }


    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        //stack.pushAtBottom(4, stack);
        stack.reverse(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }

    }
}
