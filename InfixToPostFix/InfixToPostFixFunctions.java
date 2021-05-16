
package Saurabh.InfixToPostFix;


public class InfixToPostFixFunctions {
    StackFunctions s=new StackFunctions();
    
    
    public int isEmpty(char [] emp)
    {
        int i;
//        char[] emp=new char[10];
//        for(int j=0;j<emp.length;j++)
//        {
//            emp[j]=arr[j];
//        }
        for(i=0;emp[i]!='\0';i++);
        if(i==0)
            return 1;
        else
//        emp[i-1]='\0';
//        System.out.println(emp[i]);
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
                while(isEmpty(Stack.arr)==0)
                {
//                    System.out.println("Stackp: "+Stack.arr[Stack.tos]);
//                    System.out.println(ch);
                    ans=prcd(ch,Stack.arr[Stack.tos]);
                    if(ans==1)
                        break;
                    postfix[j]=s.pop(Stack.arr);
                    //System.out.println(postfix);
                    j++;
                }
                s.push(Stack.arr,ch);
            }
        }
          while(isEmpty(Stack.arr)==0)
           {
                 postfix[j]=s.pop(Stack.arr);
                 j++;
           }
            postfix[j]='\0';
    }
}
