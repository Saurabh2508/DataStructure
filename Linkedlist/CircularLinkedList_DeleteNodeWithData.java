package Saurabh.Linkedlist;

public class CircularLinkedList_DeleteNodeWithData {

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

    public void addData(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            tail = n;
            tail.next = head;
        } else if (tail.next == head) {
            tail.next = n;
            tail = n;
            tail.next = head;
        }
    }

    public void display(int data) {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty");
            return;
        }
        while (temp.data != data) {
            temp = temp.next;
            if (temp.next == head && temp.data != data) {
                System.out.println("Item is not present in list");
                return;
            }
        }
        System.out.println("List is");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp.data != data);
        System.out.println();

    }
    public void deleteData(int data){
        if(head==null)
        {
            System.out.println("List is empty");
        }
        Node temp=head;
        Node pre=head;
        int count=1;
        while(temp.data!=data)
        {
            count++;
            pre=temp;
            temp=temp.next;
            if (temp.next == head && temp.data != data) {
                System.out.println("Item is not present in list");
                return;
            }
        }
        if(count==1 && temp.next==head)
        {
            head=null;
            return;
        }
        if(head.data==data)
        {
            while(pre.next!=head)
            {
                pre=pre.next;
            }
            temp=temp.next;
            head=temp;
            pre.next=head;
            return;
        }
        temp=temp.next;
        pre.next=temp;
    }
}
