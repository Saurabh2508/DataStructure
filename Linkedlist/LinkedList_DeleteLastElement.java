/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Saurabh.Linkedlist;

import Saurabh.Linkedlist.SinglyLinkedList.Node;

/**
 *
 * @author Saurabh Rajput
 */
public class LinkedList_DeleteLastElement {

    public void removeLastNode() {
        Node head = null;
        SinglyLinkedList.Node temp = null;
        if (head == null) {
            System.out.println("List is empty");
        }
        temp = head;
        if (temp.next == null) {
            head = head.next;
        } else {
            SinglyLinkedList.Node t = head;
//            Node prev=null;
//            while(t.next!=null)
//            {
//                prev=t;
//                t=t.next;
//            }
//            prev.next=null;
            while (t.next.next != null) {
                t = t.next;
            }
            t.next = null;
        }
    }
}
