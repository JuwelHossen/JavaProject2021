package sorting;

public class InsertionSort
{
    public static void main(String[] args)
    {
        int [] arr ={2,3,4,2,3,1,34,4};
        insertionSort(arr);

        for (int n: arr)
        {
            System.out.println(n);
        }
    }
    public static void  insertionSort(int [] A)
    {
        int i,j,key;

        for (i=1;i<A.length;i++)
        {
            key= A[i];
            j= i-1;

            while (j>=0 && A[j]>key)
            {
                A[j+1]=A[j];

                j--;
            }
            A[j+1]=key;

        }

    }

}
