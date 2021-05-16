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
public class LinkedList_SearchElement {

    public int searchNode(int data) {
        Node head = null;
        SinglyLinkedList.Node current = head;
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
}
