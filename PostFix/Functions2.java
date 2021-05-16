
package Saurabh.PostFix;

public class Functions2 {
    
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
    
    
    public float PostFixToEvalution(char [] postfix)
    {
        int i;
        char ch;
        float op1,op2,res;
        Stack.tos=-1;
        for(i=0;postfix[i]!='\0';i++)
        {
            ch=postfix[i];
            if(ch>='0'&&ch<='9')
            {
                push(Stack.arr,ch-48);
            }
            else
            {
                op2=pop(Stack.arr);
                op1=pop(Stack.arr);
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
