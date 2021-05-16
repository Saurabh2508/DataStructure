
package Saurabh.Queue;

import java.util.Scanner;


public class QueueMain {
    public static void main(String[] args) {
        int i,x;
        QueueFunctions q=new QueueFunctions();
        Scanner scanner=new Scanner(System.in);
        Queue.front=0;
        Queue.rear=-1;
        
        for(i=1;i<=Queue.arr.length;i++)
        {
            System.out.println("Enter element: ");
            x=scanner.nextInt();
            q.insert(Queue.arr, x);
        }
//        for(i=1;i<=6;i++)
//        {
//            x=q.delete(Queue.arr);
//            if(x!=-1)
//            {
//                System.out.println("Deleted elements: "+x);
//            }
//        }
        for(i=1;i<=Queue.arr.length;i++)
        {
            x=q.delete(Queue.arr);
            if(x!=-1)
            {
                System.out.println("Deleted elements: "+x);
            }
        }
    }
}
