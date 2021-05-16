
package Saurabh.PostFix;

import java.util.Scanner;


public class PostFix {
    public static void main(String[] args) {
        char[] postfix=new char[20];
        float ans;
        Functions f=new Functions();
        System.out.println("Enter a valid postfix expression");
        Scanner kb=new Scanner(System.in);
        
        String temp=kb.nextLine();
        for(int i=0;i<temp.length();i++)
        {
            postfix[i]=temp.charAt(i);
        }
        ans=f.solve(postfix);
        System.out.println(ans);
    }
}
