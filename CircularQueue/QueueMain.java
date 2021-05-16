
package Saurabh.CircularQueue;

import java.util.Scanner;


public class QueueMain {
    public static void main(String[] args) {
        int i,x;
        Queue.front=-1;
        Queue.rear=-1;
        Scanner scanner=new Scanner(System.in);
        QueueFunctions q=new QueueFunctions();
        for(i=1;i<=6;i++)
        {
            System.out.println("Enter element: ");
            x=scanner.nextInt();
            q.insert(Queue.arr,x);
        }
        for(i=1;i<=6;i++)
        {
            x=q.Delete(Queue.arr);
            if(x!=-1)
            {
                System.out.println("Deleted element is "+x);
            }
        }
        
    }
 
}
