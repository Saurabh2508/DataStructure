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
public class MergeSort {
   public void merge(int [] arr,int low,int mid,int high)
   {
      int i,j,k;
      int[]  brr=new int[high+1];
      k=low;
      i=low;
      j=mid+1;
      while(i<=mid && j<=high)
      {
          if(arr[i]<arr[j])
          {
              brr[k]=arr[i];
              i++;
              k++;
          }
          else
          {
              brr[k]=arr[j];
              j++;
              k++;
          }
          
      }
      while(i<=mid)
      {
          brr[k]=arr[i];
          i++;
          k++;
      }
      while(j<= high)
      {
          brr[k]=arr[j];
          j++;
          k++;
      }
      for(int l=low;l<=high;l++)
      {
          arr[l]=brr[l];
      }
   }
   public void mergesort(int []arr,int first,int last)
   {
       int mid;
       if(first<last)
       {
           mid=(first+last)/2;
           mergesort(arr,first,mid);
           mergesort(arr,mid+1,last);
           merge(arr,first,mid,last);
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
        MergeSort sort=new MergeSort();
        int [] arr={3,2,5,4,9,7,6,5};
        sort.display(arr);
        System.out.println();
        sort.mergesort(arr, 0, 7);
        sort.display(arr);
        
    }
}
