/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Saurabh.Stack3;

/**
 *
 * @author Saurabh Rajput
 */
public class StackFunctions {
    public void push(int []arr,int num)
    {
        if(Stack.getTos()==Stack.getArr().length-1)
        {
            System.out.println("Stack OverFLow");
            return;
        }
        int tos=Stack.getTos();
        tos=tos+1;
        int [] brr=Stack.getArr();
        brr[tos]=num;
        Stack.setArr(brr);
        Stack.setTos(tos);
        System.out.println("Tos "+Stack.getTos());
        System.out.println(num+ " is pushed to the stack");
    }
    public int pop(int [] arr)
    {
        if(Stack.getTos()==-1)
        {
            System.out.println("Stack UnderFlow");
            return -1;
        }
        int tos=Stack.getTos();
        int [] brr=Stack.getArr();
        int x=brr[tos];
        tos=tos-1;
        Stack.setTos(tos);
        return x;
    }
}
