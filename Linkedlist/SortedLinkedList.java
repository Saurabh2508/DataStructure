package Saurabh.Linkedlist;

public class SortedLinkedList {

    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    Node tail = null;

    public void insert(int data) {
        Node n = new Node(data);
        Node tem = null;
        if (head == null) {
            head = n;
            tail = n;
        } else if (data <= head.data) {
            Node temp = head;
            head = n;
            n.next = temp;
        } else {
            tem = head;
            Node t = null;
            while (tem.data < data) {
                t = tem;
                tem = tem.next;
                if (tem == null) {
                    t.next = n;
                    return;
                }
            }
            t.next = n;
            n.next = tem;
        }
    }

    public void display() {
        Node current = head;
        
        if (current == null) {
            System.out.println("List is empty");
            return;
        }
        for (; current != null; current = current.next) {
            System.out.print(current.data + " ");
        }
        System.out.println();
    }
}
