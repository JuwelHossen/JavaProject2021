package search;

public class BinarySearch
{
    public static int binary(int [] A, int length, int number)
    {
        int left, right, mid;
        left=0;
        right=length-1;

        while(left<=right)
        {
           mid=right+left/2;

           if (A[mid]==number)
           {
               return mid;
           }
           else if(A[mid]<number)
           {
               left=mid+1;
           }
           else
               right=mid-1;
        }

        return-1;
    }

    public static void main(String[] args)
    {
        int [] array ={1,2,3,4,5,6,7,7,7,7,8,9};
        int index= binary(array, array.length,1);
        System.out.println(index);
    }
}
