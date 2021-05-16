/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Saurabh.Linkedlist;

/**
 *
 * @author Saurabh Rajput
 */
public class CircularLinkedListMain {
    public static void main(String[] args) {
        CircularLinkedList_DeleteNodeWithData list=new CircularLinkedList_DeleteNodeWithData();
        list.addData(30);
        list.addData(50);
        list.addData(45);
        list.addData(70);
        list.display(30);
        list.deleteData(30);
        list.display(70);
    }
}
