/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Saurabh.Stack;

/**
 *
 * @author Saurabh Rajput
 */
public class StackFunctions {
    public void push(int [] arr,int num)
    {
        if(Stack.tos==4)
        {
            System.out.println("Stack OverFlow");
            return;
        }
        Stack.tos=Stack.tos+1;
        Stack.arr[Stack.tos]=num;
        System.out.println(num+" is pushed to the stack");
    }
    public int pop(int [] arr)
    {
        if(Stack.tos==-1)
        {
            System.out.println("Stack underflow");
            return -1;
        }
        int x=Stack.arr[Stack.tos];
        Stack.tos=Stack.tos-1;
        return x;
    }
}
