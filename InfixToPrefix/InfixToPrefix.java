
package Saurabh.InfixToPrefix;

import java.util.Scanner;


public class InfixToPrefix {
    public static void main(String[] args) {
        char [] infix=new char[30];
        char [] dumprefix=new char[30];
        char [] prefix=new char[30]; 
        System.out.println("Enter an infix expr:");
        Scanner scanner=new Scanner(System.in);
        String temp=scanner.nextLine();
        int j=0;
        for(int i=0;i<temp.length();i++)
        {
           infix[i]=temp.charAt(i);
        }
        //System.out.println(infix);
        InfixToPreFixFunctions f=new InfixToPreFixFunctions();
        f.convert(dumprefix, infix);
        for(int i=dumprefix.length-1;i>=0;i--)
        {
           prefix[j]=dumprefix[i];
           j++;
        }
        //System.out.println(dumprefix);
        System.out.println(prefix);
        
    }
}
