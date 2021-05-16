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
public class Recursion02 {
    public void f2(int n)
    {
        System.out.println(n);
    }
    public void f1()
    {
        int x=10;
        f2(x);
    }
    public static void main(String[] args) {
        int a=20;
        Recursion02 r=new Recursion02();
        r.f1();
    }
}
