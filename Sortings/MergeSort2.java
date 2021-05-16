
package Saurabh.Sortings;


public class MergeSort2 {
    public void merge(int []A,int low,int mid,int high)
    {
        int i,j,k;
        int [] B=new int[high+1];
        k=low;
        i=low;
        j=mid+1;
        while(i<=mid && j<=high)
        {
            if(A[i]<A[j])
            {
                B[k]=A[i];
                i++;
            }
            else
            {
                B[k]=A[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
        {
            B[k]=A[i];
            i++;
            k++;
        }
        while(j<=high)
        {
            B[k]=A[j];
            j++;
            k++;
        }
        for(int d=low;d<=high;d++)
        {
            A[d]=B[d];
        }
    }
    public void mergesort(int [] A,int low,int high)
    {
        int mid;
        if(low<high)
        {
            mid=(low+high)/2;
            mergesort(A,low,mid);
            mergesort(A,mid+1,high);
            merge(A,low,mid,high);
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
        MergeSort2 sort=new MergeSort2();
        int [] A={4,3,5,2,6,8,7,3};
        sort.display(A);
        System.out.println();
        sort.mergesort(A, 0, A.length-1);
        sort.display(A);
        
    }
}
