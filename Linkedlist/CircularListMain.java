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
public class CircularListMain {
    public static void main(String[] args) {
        CircularLinkedList list=new CircularLinkedList();
        list.addData(10);
        list.addData(14);
        list.addData(60);
        list.addData(40);
        list.addData(39);
        list.addData(6);
        list.display(6);
    }
}
