/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Saurabh.Searches;

/**
 *
 * @author Saurabh Rajput
 */
public class LinearSearch {
     private int linear_Search(int [] arr,int n,int x)
     {
         int i;
         for(i=0;i<n;i++)
         {
             if(arr[i]==x)
             return i; 
         }
         return -1;
     }
     public static void main(String[] args) {
        LinearSearch search=new LinearSearch();
        int [] arr={1,2,3,4,5,6};
        int number=search.linear_Search(arr, arr.length, 9);
         System.out.println(number);
    }
}

