
package Saurabh.CircularQueue;


public class QueueFunctions {
    public void insert(int [] arr,int x)
    {
        if((Queue.rear==4&&Queue.front==0)||(Queue.rear+1==Queue.front))
        {
            System.out.println("Queue Overflows");
            return;
        }
        if(Queue.rear==4)
            Queue.rear=0;
        else
            Queue.rear=Queue.rear+1;
        Queue.arr[Queue.rear]=x;
        if(Queue.front==-1)
        {
            Queue.front=0;
        }
    }
    
    public int Delete(int [] arr)
    {
        int x;
        if(Queue.front==-1)
        {
            System.out.println("Queue Underflow");
            return -1;
        }
        x=Queue.arr[Queue.front];
        if(Queue.front==Queue.rear)
            Queue.front=Queue.rear=-1;
        else if(Queue.front==4)
            Queue.front=0;
        else
            Queue.front=Queue.front+1;
        return x;
    }
}

