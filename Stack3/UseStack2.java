/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Saurabh.Stack3;

import java.util.Scanner;

/**
 *
 * @author Saurabh Rajput
 */
public class UseStack2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int tos=Stack.getTos();
        tos=-1;
        Stack.setTos(tos);
        System.out.println("tos "+Stack.getTos());
        System.out.println("Arrya length "+Stack.getArr().length);
        int x,choice;
        StackFunctions s=new StackFunctions();
        do{
              System.out.println("Enter your choice:\n1.Push\n2.pop\n3.Quit");
              choice=scanner.nextInt();
          switch(choice)
          {
              case 1:
                    System.out.println("Enter element want to push: ");
                    x=scanner.nextInt();
                    s.push(Stack.getArr(),x);
                  break;
              case 2:
                     x=s.pop(Stack.getArr());
                     if(x!=-1)
                     {
                       System.out.println("Popped element is "+x);
                     }
                  break;
              case 3:
                  choice=0;
                  break;
              default:
                  System.out.println("Wrong choice\nTry Again");
                     
          }
          }while(choice!=0);
    }
}
