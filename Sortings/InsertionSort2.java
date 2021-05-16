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
public class InsertionSort2 {
    public void insertionSort(int[] arr)
    {
        int temp,n;
        n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
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
class useInsertionSort
{
    public static void main(String[] args) {
        InsertionSort2 sort=new InsertionSort2();
        int[] arr={7,3,5,2,8,58,49};
        sort.display(arr);
        System.out.println();
        sort.insertionSort(arr);
        sort.display(arr);
    }
}
