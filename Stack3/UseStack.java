
package Saurabh.Stack3;

import java.util.Scanner;

public class UseStack {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int tos=Stack.getTos();
        tos=-1;
        Stack.setTos(tos);
        int x;
        StackFunctions s=new StackFunctions();
        System.out.println("You want to push element yes/no:");
        String choice1=scanner.next();
        if(choice1.equalsIgnoreCase("yes"))
        {
        for(int i=1;i<=Stack.getArr().length;i++)
        {
            System.out.println("Enter element want to push: ");
            x=scanner.nextInt();
            s.push(Stack.getArr(),x);
        }
        }
        System.out.println("You want to pop element yes/no:");
        String choice=scanner.next();
        if(choice.equalsIgnoreCase("yes"))
        {
        for(int i=1;i<=Stack.getArr().length;i++)
        {
            x=s.pop(Stack.getArr());
            if(x!=-1)
            {
            System.out.println("Popped element is "+x);
            }
        }
    }
}
}
