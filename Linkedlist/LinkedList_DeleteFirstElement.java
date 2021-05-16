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
public class LinkedList_DeleteFirstElement {

    public int removeFirstNode() {
        Node head = null;
        SinglyLinkedList.Node temp = null;
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
}
