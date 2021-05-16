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
public class SelectionSort2 {
    public void SelectionSort(int[] arr)
    {
        int min,temp;
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            min=i;
            for(int j=i+1;j<n;j++)
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
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
class useSelectionSort
{
    public static void main(String[] args) {
        SelectionSort2 sort=new SelectionSort2();
        int[] arr={4,6,33,8,4,9,63,6};
        sort.display(arr);
        System.out.println();
        sort.SelectionSort(arr);
        sort.display(arr);
    }
}
