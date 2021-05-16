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
public class Recursion03 {
    public void f1(int n)
    {
        if(n>0)
        {
            System.out.println(n);
            f1(n-1);
        }
    }
    public static void main(String[] args) {
        int a=9;
        Recursion03 r=new Recursion03();
        r.f1(a);
    }
}
