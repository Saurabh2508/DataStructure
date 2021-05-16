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
public class Recursion04 {
    public void f1(int n)
    {
        if(n>0)
        {
            f1(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        int a=9;
        Recursion04 r=new Recursion04();
        r.f1(a);
    }
}
