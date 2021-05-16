/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Saurabh.Recursion;

import java.util.Scanner;

/**
 *
 * @author Saurabh Rajput
 */
public class Recursion01 {
    public static void main(String[] args) {
        int a,b;
        String choice;
        System.out.println("Enter 2 integer:");
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        System.out.println("The sum of numbers is "+(a+b));
        System.out.println("Do you want to continue (Y/N)?");
        scanner.nextLine();
        choice=scanner.nextLine();
        if(choice.equalsIgnoreCase("y"))
        {
            String[] str={"y"};
            main(str);
        }
    }
}
