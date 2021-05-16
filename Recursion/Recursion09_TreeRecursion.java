/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Saurabh.Recursion;

/**
 *
 * @author Saurabh Rajput
 */
//TREE RECURSION: 
//If a function is calling itself recursively more than one time in its body then , then it is called tree recursion. In other words if the function contains 2 or more calls to itself then it is called tree recursion

public class Recursion09_TreeRecursion {
    void fun(int n)
    {
        if(n>0)
        {
            System.out.println(n);
            fun(n-1);
            fun(n-1);
        }
    }
    public static void main(String[] args) {
        int  a=3;
        Recursion09_TreeRecursion r=new Recursion09_TreeRecursion();
        r.fun(a);
    }
}
