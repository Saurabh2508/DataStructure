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
public class Recursion12_Sum {
    public int sum(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        else
        {
            return sum(n-1)+n;
        }
    }
    public static void main(String[] args) {
        Recursion12_Sum s=new Recursion12_Sum();
        int sum=s.sum(4);
        System.out.println(sum);
    }
}
