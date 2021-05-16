/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Saurabh.Linkedlist;

/**
 *
 * @author Saurabh Rajput
 */
public class DoublyLinkedList {

    class Node {

        Node previous;
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.previous=null;
        }
    }
    Node head;
    Node tail;

    public void addNode(int data) {
        Node n = new Node(data);

        if (head == null) {
            head = n;
            tail = n;
        } else {
            n.previous=tail;
            tail.next=n;
            tail = n;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        for (; current != null; current = current.next) {
            System.out.print(current.data + " ");
        }
        System.out.println();
    }

    public void reverseDisplay() {
        Node current = tail;
        if (current == null) {
            System.out.println("List is empty");
            return;
        }
        for (; current != null; current = current.previous) {
            System.out.print(current.data + " ");
        }
        System.out.println();
    }
}
