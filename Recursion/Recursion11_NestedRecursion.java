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
//NESTED RECURSION: 
//If the recursive call of a function calls itself in its parameter then it is called nested recursion recursion. 
//In other words if the call to the same function is present in the parameter list of a recursive call then it is called nested recursion

public class Recursion11_NestedRecursion {
    public int fun(int n)
    {
        if(n>100)
        {
            return n-10;
        }
        else
        {
            System.out.println(n);
            return fun(fun(n+11));
        }
    }
    public static void main(String[] args) {
        int a=95;
        Recursion11_NestedRecursion R=new Recursion11_NestedRecursion();
        System.out.println(R.fun(a));
    }
}
