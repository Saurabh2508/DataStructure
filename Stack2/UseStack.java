
package Saurabh.Stack2;

import java.util.Scanner;

public class UseStack {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        Stack.StackSize();
//        System.out.println("Enter the size of Stack ");
//        Stack.size=scanner.nextInt();
//        Stack.arr=new int[Stack.size];
        Stack.tos=-1;
        int x;
        StackFunctions s=new StackFunctions();
        System.out.println("You want to push element yes/no:");
        String choice1=scanner.next();
        if(choice1.equalsIgnoreCase("yes"))
        {
        for(int i=0;i<=Stack.arr.length;i++)
        {
            System.out.println("Enter element want to push: ");
            x=scanner.nextInt();
            s.push(Stack.arr,x);
        }
        }
        System.out.println("You want to pop element yes/no:");
        String choice=scanner.next();
        if(choice.equalsIgnoreCase("yes"))
        {
        for(int i=0;i<=Stack.arr.length;i++)
        {
            x=s.pop(Stack.arr);
            if(x!=-1)
            {
            System.out.println("Popped element is "+x);
            }
        }
        }
    }
}
