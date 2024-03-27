package com.company.dataStructure.LinkedList;

public class LL {

    private Node head;
    private int size;

    LL () {
        size = 0;
    }
    class Node {
        private String data;
        private Node next;

        Node (String data) {
            this.data = data;
            this.next = null;
            size ++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printLL() {
        if (head == null) {
            System.out.println("Linked List is empty");
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    public void deleteFisrt() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        size --;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        size --;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node last = head.next;
        while (last.next != null) {
            last = last.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }

    public static void main (String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printLL();
        list.addFirst("this");
        list.addLast("list");
        list.printLL();
        list.deleteFisrt();
        list.deleteLast();
        list.printLL();
        System.out.println(list.getSize());
        list.addFirst("this");
        list.addLast("list");
        list.printLL();
        list.reverseIterative();
        list.printLL();

        LL list2 = new LL();
        list2.addLast("1");
    }

    // It works by taking 3 pointer; (prev curr and next)
    public void reverseIterative() {

        // base case : Blank or single node linked list
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;

            //Update
            currNode.next = prevNode; // reversing the link of current node to prev node
            prevNode = currNode; // update pointer of prev node to current node
            currNode = nextNode; // update pointer of current node to next node
        }

        head.next = null; // remove remaining forward link btwn 1st and 2nd node
        head = prevNode; // make last node, the head of the linked list (as while traverse it reaches to last node)
    }

    public Node reverseRecursive(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseRecursive(head.next); // create a new head with new list going upward on stack
        // and return with last node as a head
        head.next.next = head;  // creating a reverse link between 2 elements as they are on diff stack
        head.next = null; // removing the previous forward link

        return newHead;
    }

    // Find the nth node from the end & remove it.
    //Time complexity - O(n)
    //Space complexity - O(1)
    public Node deleteNthNodeFromLast(Node head, int n) {

        if (head == null || head.next == null) {
            return null;
        }

        int size = 0;
        Node currNode = head;
        while (currNode != null) {
            currNode = currNode.next;
            size++;
        }

        //removing SIZEth node from last i.e. head
        if(n == size) {
            return head.next;
        }

        // find previous node
        int prevIndexToSearch = size - n;  // position to find
        Node prevNode = head; // previous node
        int i = 1;            // current position
        while (i < prevIndexToSearch) {
            prevNode = prevNode.next;
            i++;
        }

        prevNode.next = prevNode.next.next;
        return head;

    }

    // Palindromic Linked List
    // 1. Find the Middle
    // 2. reverse the second half of linked list
    // 3. Compare the first and second half of linked list
    public boolean palindromicLinkedList(Node head) {

        if (head == null || head.next == null) {
            return true;
        }

        Node middle = getMiddle(head);
        Node secondListHead = reverse(middle.next);

        Node firstListHead = head;
        while (secondListHead != null) {
            if (firstListHead.data != secondListHead.data) {
                return false;
            }

            firstListHead = firstListHead.next;
            secondListHead = secondListHead.next;
        }

        return true;
    }

    private Node reverse(Node head) {

        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head.next = null;
        prev = head;
        return prev;
    }

    private Node getMiddle(Node head) {

        Node pointer1 = head;
        Node pointer2 = head;
        while (pointer1.next != null && pointer1.next.next != null) {

            pointer1 = pointer1.next.next;
            pointer2 = pointer2.next;
        }
        return pointer2;
    }

    // Detect cycle in Linked List
    //Time complexity - O(n)
    //Space complexity - O(1)
    public boolean detectCycleInLinkedList(Node head) {

        if (head == null || head.next == null) {
            return false;
        }

        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {

            if (fast == slow) {
                return true;
            }

            fast = fast.next.next;
            slow = slow.next;
        }

        return false;
    }
}
