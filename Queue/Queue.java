
package Saurabh.Queue;

import java.util.Scanner;


public class Queue {
    static int front;
    static int rear;
    static int size;
    static int [] arr;
    static
    {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the size of the queue");
    size=scanner.nextInt();
    arr=new int[size];
    }
}

