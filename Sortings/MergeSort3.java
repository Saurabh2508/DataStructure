
package Saurabh.Sortings;


public class MergeSort3 {
    private void merge(int [] arr,int low,int high)
    {
        int mid,i,j,k;
        int[] brr=new int [high+1];
        mid=(low+high)/2;
        i=low;
        j=mid+1;
        k=low;
        while(i<=mid && j<=high )
        {
            if(arr[i]<arr[j])
            {
                brr[k]=arr[i];
                i++;
            }
            else
            {
                brr[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
        {
            brr[k]=arr[i];
            i++;
            k++;
        }
        while(j<=high)
        {
            brr[k]=arr[j];
            j++;
            k++;
        }
        for(int n=low;n<=high;n++)
        {
            arr[n]=brr[n];
        }
    }
    public void display(int [] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public void mergeSort(int [] arr,int low,int high)
    {
        int mid;
        if(low<high)
        {
            mid=(low+high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,high);
        }
    }
}
class UseMergeSort
{
    public static void main(String[] args) {
        MergeSort3 sort=new MergeSort3();
        int [] arr={5,3,7,4,7,8,59,5};
        sort.display(arr);
        System.out.println();
        sort.mergeSort(arr, 0, arr.length-1);
        sort.display(arr);
    }
}
