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
public class BinarySearch {
    public int binary_Search(int []arr,int n,int x)
    {
        int low,high,mid;
        low=0;
        high=n-1;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]==x)
            {
                return mid;
            }
            if(x>arr[mid])
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearch search=new BinarySearch();
        int []arr={1,2,3,4,5,6,7};
        int n=search.binary_Search(arr, arr.length, 7);
        System.out.println(n);
    }
}
