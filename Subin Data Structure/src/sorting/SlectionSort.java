package sorting;

public class SlectionSort
{
    public static void main(String[] args)
    {
        int [] arr ={2,3,4,2,3,1,34,40,90,0};
        selectionSort(arr, arr.length);

        for (int n: arr)
        {
            System.out.println(n);
        }
    }

    private static void selectionSort(int[] A, int length)
    {

       int i,j,temp,index_min;

       for (i=0;i<length;i++)
       {
           index_min=i;
           for(j=i+1;j<length;j++)
           {
                if (A[j]<A[index_min])
                {
                    index_min=j;
                }
           }
           if(index_min!= i)
           {
               temp= A[i];
               A[i]=A[index_min];
               A[index_min]=temp;
           }
       }
    }

}
