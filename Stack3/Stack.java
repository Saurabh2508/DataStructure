/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Saurabh.Stack3;

import java.util.Scanner;


public class Stack {
    private static int tos;
    private static int [] arr;

    public static int getTos() {
        return tos;
    }

    public static void setTos(int tos) {
        Stack.tos = tos;
    }

    public static int[] getArr() {
        return arr;
    }

    public static void setArr(int[] arr) {
        Stack.arr = arr;
    }
    static
    {
        System.out.println("Enter the size of stack");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        arr=new int[size];
    }
}
