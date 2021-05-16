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
//INDIRECT RECURSION: 
//If 2 or more functions are calling themselves in a CIRCULAR MANNER  , then it is called indirect recursion. 

public class Recursion10_IndirectRecursion {
    void funA(int n)
    {
        if(n>0)
        {
            System.out.print(n+",");
            funB(n-1);
        }
    }
    void funB(int n)
    {
        if(n>0)
        {
            System.out.print(n+",");
            funA(n/2);
        }
    }
    public static void main(String[] args) {
        int x=20;
        Recursion10_IndirectRecursion R=new Recursion10_IndirectRecursion();
        R.funA(x);
    }
}
