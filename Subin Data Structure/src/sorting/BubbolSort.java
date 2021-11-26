package sorting;

public class BubbolSort
{
    public static void main(String[] args) {

        int [] arr ={2,3,4,2,3,1,34,4};
         bubbolSort(arr, arr.length);

        for (int n: arr)
        {
            System.out.println(n);
        }
    }

    public static void bubbolSort(int [] A, int n)
    {
        int i,j,temp;
        for ( i=0;i<=n;i++)
        {
            for ( j=0; j<n-1;j++)
            {
                if (A[j]>A[j+1])
                {
//                    temp =A[j];
//                    A[j]=A[j+1];
//                    A[j+1]=temp;
                    swap(A,j,j+1);

                }
            }

        }
    }

    public  static void swap(int [] a, int x,int y)
    {
        int temp= a[x];
        a[x]=a[y];
        a[y]=temp;
    }


}
