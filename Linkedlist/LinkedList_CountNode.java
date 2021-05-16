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
public class LinkedList_CountNode {

    public int countNode() {
        Node head = null;
        int count = 0;
        SinglyLinkedList.Node current = head;
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
}
