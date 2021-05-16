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
public class LinkedList_DeleteDataWithElement {

    public void delete(int data) {
        Node head = null;
        if (head == null) {
            System.out.println("List is empty");
            //System.exit(0);
            return;
        }
        Node curre = head;
        int count = 1;
        while (curre.data != data) {
            count++;
            curre = curre.next;
            if (curre == null) {
                System.out.println("Item is not present");
                System.exit(0);
            }
        }
        System.out.println(count + " count");
        if (count == 1) {
            Node temp;
            temp = head;
            head = head.next;
            //       } else if (curre == null) {
//            Node t = head;
//            while (t.next.next != null) {
//                t = t.next;
//            }
//            t.next = null;
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
