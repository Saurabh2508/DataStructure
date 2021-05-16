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
public class Recursion14_Time {
    public void f(int n)
    {
        for(int i=n;i>1;)
        {
            System.out.println(i);
            i=i/2;
        }
    }
    public static void main(String[] args) {
        Recursion14_Time r=new Recursion14_Time();
        r.f(10);
    }
}
