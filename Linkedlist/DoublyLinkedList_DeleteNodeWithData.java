
package Saurabh.Linkedlist;

public class DoublyLinkedList_DeleteNodeWithData {
    class Node{
        int data;
        Node pre;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
            this.pre=null;
        }
    }
    Node head;
    Node tail;
     
    public void addNode(int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            tail=n;
        }
        else
        {
            n.pre=tail;
            tail.next=n;
            tail=n;
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
        for (; current != null; current = current.pre) {
            System.out.print(current.data + " ");
        }
        System.out.println();
    }
    public void deleteData(int data)
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        Node current=head;
        Node temp=null;
        int count=1;
        while(current.data!=data)
        {
            count++;
            temp=current;
            current=current.next;
            if(current==null)
            {
                System.out.println("data is not present");
                return;
            }
        }
        if(count==1)
        {
            head=head.next;
            if(head==null)
            {
                tail=null;
            }
            else
            {
                head.pre=null;
            }
        }
        else
        {
            if(current==tail)
            {
                tail=tail.pre;
                tail.next=null;
                return;
            }
            current=current.next;
            current.pre=temp;
            temp.next=current;
        }
    }
}
