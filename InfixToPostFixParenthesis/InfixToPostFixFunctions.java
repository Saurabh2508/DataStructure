
package Saurabh.InfixToPostFixParenthesis;


public class InfixToPostFixFunctions {
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
        if(op2=='$')
            return 0;
        else if(op1=='$')
            return 1;
        else if(op2=='*'||op2=='/'||op2=='%')
            return 0;
        else if(op1=='*'||op1=='/'||op1=='%')
            return 1;
        else if(op2=='+'||op2=='-')
            return 0;
        else 
            return 1;
    }
    
    
    public void convert(char[] postfix,char [] infix)
    {
        int i,j=0;
        char ch;
        int ans;
        Stack.tos=-1;
        
        for(i=0;infix[i]!='\0';i++)
        {
            ch=infix[i];
            if(ch>='0'&&ch<='9')
            {
                postfix[j]=ch;
                j++;
            }
            else
            {
                switch (ch) {
                    case '(':
                        s.push(Stack.arr, ch);
                        break;
                    case ')':
                        char c;
                        do
                        {
                            c=s.pop(Stack.arr);
                            if(c!='(')
                            {
                            postfix[j]=c;
                            j++;
                            }
                        }while(c!='(');
                        break;
                    default:
                        while(isEmpty(Stack.arr)==0)
                        {
                            ans=prcd(ch,Stack.arr[Stack.tos]);
                            if(ans==1)
                                break;
                            char a=s.pop(Stack.arr);
                                postfix[j]=a;
                                j++;
                        }       s.push(Stack.arr,ch);
                        break;
                }
            }
        }
          while(isEmpty(Stack.arr)==0)
           {
                 char c=s.pop(Stack.arr);
                        postfix[j]=c;
                        j++;
           }
            postfix[j]='\0';
    } 
}
