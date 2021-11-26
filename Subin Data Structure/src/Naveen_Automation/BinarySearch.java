package Naveen_Automation;

public class BinarySearch
{
    public static int binary(int A [], int n, int x)
    {
        int left, right,mid;
        left=0;
        right=n-1;
        while(left<=right)
        {
            mid=(left+right)/2;

            if(A[mid]==x)
            {
                return mid;
            }
            if(A[mid]<x)
            {
                left=mid+1;
            }else
                right=mid-1;
        }

       return -1;
    }

    public static void main(String[] args)
    {
        int [] Array ={1,2,3,4,5,6,7,8};
        System.out.println(binary(Array,8,5));
    }



}
