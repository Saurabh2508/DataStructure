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
public class SelectionSort {
    public void selection_sort(int arr[], int n)
    {
        int i,j,temp,min;
        for(i=0;i<n-1;i++)
        {
            min=i;
            for(j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public void print(int [] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr={3,2,5,6,7,3,8};
        SelectionSort sort=new SelectionSort();
        sort.print(arr);
        System.out.println();
        sort.selection_sort(arr,arr.length);
        sort.print(arr);
        
    }
}
