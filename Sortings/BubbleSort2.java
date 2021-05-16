/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Saurabh.Sortings;

/**
 *
 * @author Saurabh Rajput
 */
public class BubbleSort2 {
    public void bubbleSort(int[] arr)
    {
        int temp;
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public void display(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
class useBubbleSort
{
    public static void main(String[] args) {
        BubbleSort2 sort=new BubbleSort2();
        int[] arr={4,6,3,7,9,5,8,3};
        sort.display(arr);
        System.out.println();
        sort.bubbleSort(arr);
        sort.display(arr);
    }
}
