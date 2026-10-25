package com.algorithmicjourney.practice;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class SinglyLinkedList {

    Node head;
    Node tail;

    SinglyLinkedList() {
        head = new Node(-1);
        tail = head;
    }

    void insertEnd(int val) {
        tail.next = new Node(val);
        tail = tail.next;
    }

    void remove(int index) {
        int i = 0;
        Node current = head;
        while (i < index && current.next != null) {
            current = current.next;
            i++;
        }

        // Remove the node ahead of current
        if (current != null && current.next != null) {
            if (current.next == tail) {
                tail = current; // Update the tail to point to the new last node
            }
            current.next = current.next.next;
        }

    }

}
