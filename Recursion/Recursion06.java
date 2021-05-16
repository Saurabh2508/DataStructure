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
public class Recursion06 {
    static int x=0;
    public int fun(int n)
    {
        
        if(n>0)
        {
            x++;
            return fun(n-1)+x;
        }
        return 0;
    }
    public static void main(String[] args) {
        int a=5;
        Recursion06 r=new Recursion06();
        System.out.println(r.fun(a));
    }
}
