
package Saurabh.PostFix;


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
    public float solve(char [] postfix)
    {
        int i;
        char ch;
        float op1,op2,res;
        Stack.tos=-1;
        for(i=0;postfix[i]!='\0';i++)
        {
            ch=postfix[i];
            System.out.println(ch);
            if(isoprnd(ch)==1)
            {
                push(Stack.arr,ch-48);
            }
            else
            {
                op2=pop(Stack.arr);
                op1=pop(Stack.arr);
                res=evaluate(op1,op2,ch);
                push(Stack.arr,res);
            }
        }
       res=pop(Stack.arr);
       return res;
    }

    private int isoprnd(char ch) {
        if(ch>='0'&&ch<='9')
            return 1;
        else
            return 0;
        //return(ch>='0'&&ch<='9');
    }

    private float evaluate(float op1, float op2, char ch) {
        switch(ch)
        {
            case '+':
                return op1+op2;
            case '-':
                return op1-op2;
            case '*':
                return op1*op2;
            case '/':
                return op1/op2;
            case '$':
                return (float)Math.pow(op1,op2);
            case '%':
                return op1%op2;
            default:
                    return 0;   
        }
    }
}
