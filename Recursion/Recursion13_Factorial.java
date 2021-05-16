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
public class Recursion13_Factorial {
    public int fact(int n)
    {
        if(n<=1)
        return 1;
        else
            return fact(n-1)*n;
    }
    public static void main(String[] args) {
        Recursion13_Factorial r=new Recursion13_Factorial();
        int fact=r.fact(4);
        System.out.println(fact);
    }
}
