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
public class Recursion07_TailRecursion {
    void f1(int n)
    {
        if(n>0)
        {
            System.out.println(n);
            f1(n-1);
        }
    }
    public static void main(String[] args) {
        int a=3;
        Recursion07_TailRecursion r=new Recursion07_TailRecursion();
        r.f1(a);
    }
}
