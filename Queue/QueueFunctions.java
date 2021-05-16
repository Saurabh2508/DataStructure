
package Saurabh.Queue;


public class QueueFunctions {
    public void insert(int [] arr,int x)
    {
        if(Queue.rear==Queue.arr.length)
        {
            System.out.println("Queue Overflow");
            return;
        }
        Queue.rear=Queue.rear+1;
        Queue.arr[Queue.rear]=x;
        System.out.println("Element Inserted");
    }
    public int delete(int [] arr)
    {
        int x;
        if(Queue.front>Queue.rear)
        {
            System.out.println("Queue Underflow");
            return -1;
        }
        x=Queue.arr[Queue.front];
        Queue.front=Queue.front+1;
        return x;
    }
}
