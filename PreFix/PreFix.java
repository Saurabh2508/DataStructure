/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Saurabh.PreFix;

import java.util.Scanner;

/**
 *
 * @author Saurabh Rajput
 */
public class PreFix {
    public static void main(String[] args) {
        char[] prefix=new char[20];
        float ans;
        Functions f=new Functions();
        System.out.println("Enter a valid prefix expression");
        Scanner kb=new Scanner(System.in);
        
        String temp=kb.nextLine();
        for(int i=0;i<temp.length();i++)
        {
            prefix[i]=temp.charAt(i);
        }
        ans=f.PreFixToEvalution(prefix);
        System.out.println(ans);
    }
}
