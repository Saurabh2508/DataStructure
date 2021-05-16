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
public class LinkedList_DisplayList {

    public void display() {
        Node head = null;
        SinglyLinkedList.Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("List is");
//        while(current!=null)
//        {
//            System.out.print(current.data+" ");
//            current=current.next;
//        }
        for (SinglyLinkedList.Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.data + " ");
        }
        System.out.println();
    }
}
