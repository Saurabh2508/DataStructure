/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Saurabh.Stack;

import java.util.Scanner;

/**
 *
 * @author Saurabh Rajput
 */
public class UseStack {
    public static void main(String[] args) {
        Stack.tos=-1;
        int x;
        Scanner scanner=new Scanner(System.in);
        StackFunctions s=new StackFunctions();
        for(int i=1;i<=6;i++)
        {
            System.out.println("Enter element want to push: ");
            x=scanner.nextInt();
            s.push(Stack.arr,x);
        }
        for(int i=1;i<=6;i++)
        {
            x=s.pop(Stack.arr);
            if(x!=-1)
            {
            System.out.println("Popped element is "+x);
            }
        }
    }
}
