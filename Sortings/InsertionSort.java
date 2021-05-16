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
public class InsertionSort {
    public void insertion_sort(int arr[],int n)
    {
        int i,j,temp;
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else 
                {
                    break;
                }
                    
            }
        }
    }
    public void display(int [] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr={3,4,3,5,74,53,6,8,9,0,-1};
        InsertionSort sort=new InsertionSort();
        System.out.println("Before sorting");
        sort.display(arr);
        sort.insertion_sort(arr, arr.length);
        System.out.println("After sorting");
        sort.display(arr);
       
    }
}
