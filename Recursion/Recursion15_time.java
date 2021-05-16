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
public class Recursion15_time {
    public static void f(int n)
    {
             for(int i=1;i<n;)
      {
	         System.out.println(i);
	         i=i*2;
     }

    }
    public static void main(String[] args) {
        f(9);
    }
}
