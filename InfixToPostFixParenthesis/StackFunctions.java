
package Saurabh.InfixToPostFixParenthesis;


public class StackFunctions {
   public void push(char[] arr,char ch)
    {
        if(Stack.tos==arr.length-1)
        {
            System.out.println("Stack OverFlow");
            return;
        }
        Stack.tos=Stack.tos+1;
        arr[Stack.tos]=ch;
        
    }
    public char pop(char [] arr)
    {
        if(Stack.tos==-1)
        {
            System.out.println("Stack UnderFlow");
            return ',';
        }
        char c=arr[Stack.tos];
        Stack.arr[Stack.tos]='\0';
        Stack.tos=Stack.tos-1;
        return c;
    } 
}
