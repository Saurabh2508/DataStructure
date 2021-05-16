
package Saurabh.Sortings;


public class BubbleSort {
    public void bubble_sort(int []arr,int n)
    {
        int i,j,temp;
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
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
    public static void main(String[] args) {
        BubbleSort sort=new BubbleSort();
        int [] arr={3,2,6,1,9,5};
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sort.bubble_sort(arr, arr.length);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
