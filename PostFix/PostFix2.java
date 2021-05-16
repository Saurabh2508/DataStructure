
package Saurabh.PostFix;

import java.util.Scanner;


public class PostFix2 {
    public static void main(String[] args) {
        char[] postfix=new char[20];
        float ans;
        Functions2 f=new Functions2();
        System.out.println("Enter a valid postfix expression");
        Scanner kb=new Scanner(System.in);
        
        String temp=kb.nextLine();
        for(int i=0;i<temp.length();i++)
        {
            postfix[i]=temp.charAt(i);
        }
        ans=f.PostFixToEvalution(postfix);
        System.out.println(ans);
    }
    
}
