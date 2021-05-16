
package Saurabh.InfixToPostFixParenthesis;

import java.util.Scanner;


public class InfixToPostFix {
    public static void main(String[] args) {
        char [] infix=new char[30];
        char [] postfix=new char[30];
         
        System.out.println("Enter an infix expr:");
        Scanner scanner=new Scanner(System.in);
        String temp=scanner.nextLine();
        for(int i=0;i<temp.length();i++)
        {
            infix[i]=temp.charAt(i);
        }
        InfixToPostFixFunctions f=new InfixToPostFixFunctions();
        f.convert(postfix, infix);
        System.out.println(postfix);
    }
}
