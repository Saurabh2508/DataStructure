package Saurabh.Linkedlist;

public class SinglyLinkedList {

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

    public void addNode(int data) {
        Node n = new Node(data);

        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    public void display() {
        Node current = head;

        if (current == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("List is");
        for (; current != null; current = current.next) {
            System.out.print(current.data + " ");
        }
        System.out.println();
    }

    public int countNode() {
        int count = 0;
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return 0;
        }
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public int searchNode(int data) {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        int count = 1;
        while (current != null) {
            if (current.data == data) {
                return count;
            }
            count++;
            current = current.next;
        }
        return -1;
    }

    public int removeFirstNode() {
        Node temp = null;
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        } else {
            temp = head;
            head = head.next;
        }
        if (temp != null) {
            return temp.data;
        } else {
            return -1;
        }
    }

    public void removeLastNode() {
        Node temp = null;
        if (head == null) {
            System.out.println("List is empty");
        }
        temp = head;
        if (temp.next == null) {
            head = head.next;
        } else {
            Node t = head;
            while (t.next.next != null) {
                t = t.next;
            }
            t.next = null;
        }
    }

    public void deleteAny(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node curre = head;
        int count = 1;
        while (curre.data != data) {
            count++;
            curre = curre.next;
            if (curre == null) {
                System.out.println("Item is not present");
                return;
            }
        }
        if (count == 1) {
            Node temp;
            temp = head;
            head = head.next;
        } else {
            Node curr = head;
            Node pre = null;
            while (curr.data != data) {
                pre = curr;
                curr = curr.next;
            }
            curr = curr.next;
            pre.next = curr;
        }
    }
}
