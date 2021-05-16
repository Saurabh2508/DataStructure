
package Saurabh.InfixToPrefix;


public class InfixToPreFixFunctions {
    StackFunctions s=new StackFunctions();
    public int isEmpty(char [] emp)
    {
        int i;
        for(i=0;emp[i]!='\0';i++);
        if(i==0)
            return 1;
        else
            return 0; 
    }
    public int prcd(char op1,char op2)
    {
        if(op1=='$')
            return 1;
        else if(op2=='$')
            return 0;
        else if(op1=='*'||op1=='/'||op1=='%')
            return 1;
        else if(op2=='*'||op2=='/'||op2=='%')
            return 0;
        else if(op1=='+'||op1=='-')
            return 1;
        else 
            return 0;
    }
    public void convert(char[] prefix,char [] infix)
    {
        int i,j=0,k;
        char ch;
        int ans;
        Stack.tos=-1;                                           
        for(k=0;infix[k]!='\0';k++);
        for(i=k-1;i>=0;i--)
        {
            ch=infix[i];
            if(ch>='0'&&ch<='9')
            {
                prefix[j]=ch;
                j++;
            }
            else
            {
                while(isEmpty(Stack.arr)==0)
                {
                    ans=prcd(ch,Stack.arr[Stack.tos]);
                    if(ans==1)
                        break;
                    prefix[j]=s.pop(Stack.arr);
                    j++;
                }
                s.push(Stack.arr,ch);
            }
        }
          while(isEmpty(Stack.arr)==0)
           {
                 prefix[j]=s.pop(Stack.arr);
                j++;
           }
            prefix[j]='\0';
    }
}
