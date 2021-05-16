/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Saurabh.PreFix;

/**
 *
 * @author Saurabh Rajput
 */
public class Functions {
     public void push(float [] arr,float num)
    {
        if(Stack.tos==Stack.arr.length-1)
        {
            System.out.println("Stack OverFlow");
            return;
        }
        Stack.tos=Stack.tos+1;
        Stack.arr[Stack.tos]=num;
    }
    
    
    public float pop(float [] arr)
    {
        if(Stack.tos==-1)
        {
            System.out.println("Stack underflow");
            return -1;
        }
        float x=Stack.arr[Stack.tos];
        Stack.tos=Stack.tos-1;
        return x;
    }
    public float PreFixToEvalution(char [] prefix)
    {
        int len,i;
        char ch;
        float op1,op2,res;
        Stack.tos=-1;
        for(len=0;prefix[len]!='\0';len++);
        System.out.println(len);
        for(i=len-1;i>=0;i--)
        {
            ch=prefix[i];
            //System.out.println(ch);
            if(ch>='0'&&ch<='9')
            {
                push(Stack.arr,ch-48);
            }
            else
            {
                op1=pop(Stack.arr);
                op2=pop(Stack.arr);
                switch(ch)
               {
                    case '+':
                        res=op1+op2;
                        break;
                    case '-':
                        res=op1-op2;
                        break;
                    case '*':
                        res=op1*op2;
                        break;
                    case '/':
                        res=op1/op2;
                        break;
                    case '$':
                        res=(float)Math.pow(op1,op2);
                        break;
                    case '%':
                        res=op1%op2;
                        break;
                    default:
                         res=0;
                         break;
                }
                push(Stack.arr,res);
            }
        }
       res=pop(Stack.arr);
       return res;
    }
    
}
