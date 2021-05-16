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
public class Recursion05 {
    public int fun(int n)
    {
        if(n>0)
        {
           return fun(n-1)+n;
        }
        return 0;
    }
    public static void main(String[] args) {
        int a=5;
        Recursion05 r=new Recursion05();
        System.out.println(r.fun(a));
    }
}
