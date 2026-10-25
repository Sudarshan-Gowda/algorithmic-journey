package com.algorithmicjourney.practice;

public class LinkedList {

    static class Node {
        int val;
        Node next;
        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(10, null);
        Node node2 = new Node(20, null);
        Node node3 = new Node(30, null);

        node1.next = node2;
        node2.next = node3; // or node1.next.next = node3;

        Node head = node1;
        Node tail = node3;

        iterate(head);
    }

    static void iterate(Node head){

        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }

}
