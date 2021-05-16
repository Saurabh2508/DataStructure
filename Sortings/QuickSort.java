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
public class QuickSort {
    public int partition(int[] A,int low,int high)
    {
        int pivot=A[low];
        int i=low+1;
        int j=high;
        int temp;
        do
        {
            while(A[i]<=pivot)
            {
                i++;
            }
            while(A[j]>pivot)
            {
                j--;
            }
            if(i<j)
            {
                temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }
        }while(i<j);
        temp=A[low];
        A[low]=A[j];
        A[j]=temp;
        
        return j;
    }
    public void quickSort(int A[],int low,int high)
    {
        int partitionIndex;
        
        if(low<high)
        {
            partitionIndex= partition(A,low,high);
            quickSort(A,low,partitionIndex-1);
            quickSort(A,partitionIndex+1,high);
        }
    }
    public void display(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        QuickSort sort=new QuickSort();
        int[] arr={2,3,7,4,89,3,94,3};
        sort.display(arr);
        System.out.println();
        sort.quickSort(arr, 0, arr.length-1);
        sort.display(arr);
    }
}
