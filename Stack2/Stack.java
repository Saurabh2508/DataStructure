/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Saurabh.Stack2;

import java.util.Scanner;

public class Stack {
    static int tos;
    static int size;
    static int [] arr;
//    public static void StackSize()
//    {
//        System.out.println("Enter the size of Stack ");
//        Scanner kb=new Scanner(System.in);
//        size=kb.nextInt();
//        arr=new int[size];
//    }
    static
    {
        System.out.println("Enter the size of Stack ");
        Scanner kb=new Scanner(System.in);
        size=kb.nextInt();
        arr=new int[size];
    }
}
