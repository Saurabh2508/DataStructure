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
public class Recursion08_HeadRecursion {
    void f2(int n)
    {
        if(n>0)
        {
            f2(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        int a=3;
        Recursion08_HeadRecursion r=new Recursion08_HeadRecursion();
        r.f2(3);
    }
}
