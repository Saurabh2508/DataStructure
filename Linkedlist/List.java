/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Saurabh.Linkedlist;

import Saurabh.Linkedlist.SinglyLinkedList.Node;

public class List {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addNode(30);
        list.addNode(50);
        list.addNode(45);
        list.addNode(4);
        list.addNode(78);
        list.display();
        System.out.println("The number of nodes is " + list.countNode());
        int node = list.searchNode(66);
        if (node != -1) {
            System.out.println("The node is present at " + node);
        } else {
            System.out.println("Item is not present in the list");
        }
        int n = list.removeFirstNode();
        if (n != -1) {
            System.out.println(n);
        }
        list.display();
        list.removeLastNode();
        list.display();
        list.deleteAny(30);
        list.display();
    }
}
